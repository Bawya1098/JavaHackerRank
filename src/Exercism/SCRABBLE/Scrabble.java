package Exercism.SCRABBLE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scrabble {
    String word;
    List<Character> valSetOne = new ArrayList<>();

    {
        valSetOne.add('A');
        valSetOne.add('E');
        valSetOne.add('I');
        valSetOne.add('O');
        valSetOne.add('U');
        valSetOne.add('L');
        valSetOne.add('N');
        valSetOne.add('R');
        valSetOne.add('S');
        valSetOne.add('T');
    }

    List<Character> valSetTwo = new ArrayList<>();

    {
        valSetTwo.add('D');
        valSetTwo.add('G');
    }

    List<Character> valSetThree = new ArrayList<>();

    {

        valSetThree.add('B');
        valSetThree.add('C');
        valSetThree.add('M');
        valSetThree.add('P');

    }

    List<Character> valSetFour = new ArrayList<>();

    {
        valSetFour.add('F');
        valSetFour.add('H');
        valSetFour.add('V');
        valSetFour.add('W');
        valSetFour.add('Y');
    }

    List<Character> valSetFive = new ArrayList<>();

    {
        valSetFive.add('K');
    }


    List<Character> valsetSix = new ArrayList<>();

    {
        valsetSix.add('J');
        valsetSix.add('X');
    }

    List<Character> valSetSeven = new ArrayList<>();

    {
        valSetSeven.add('Q');
        valSetSeven.add('Z');
    }

    Map<Integer, List<Character>> map = new HashMap<>();

    {
        map.put(1, valSetOne);
        map.put(2, valSetTwo);
        map.put(3, valSetThree);
        map.put(4, valSetFour);
        map.put(5, valSetFive);
        map.put(8, valsetSix);
        map.put(10, valSetSeven);
    }

    public Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.toUpperCase().charAt(i);
            for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
                int key = entry.getKey();
                List<Character> values = entry.getValue();
                for (Character c : values) {
                    if (c.equals(letter)) {
                        sum += key;
                    }
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("quirky");
        System.out.println(scrabble.getScore());
    }


}
