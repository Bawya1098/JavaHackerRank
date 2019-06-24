package Anagrans;

import java.util.HashMap;
import java.util.Scanner;

public class Isanagram {
    static boolean isAnagram(String a, String b) {
        char[] ArrayA = a.toLowerCase().toCharArray();
        char[] ArrayB = b.toLowerCase().toCharArray();
        int count = 1;
        HashMap<Character, Integer> mapA = mappingA(ArrayA, count);
        HashMap<Character, Integer> mapB = mapB(ArrayB, count);
        boolean result;
        result = mapA.equals(mapB);
        return result;
    }

    private static HashMap<Character, Integer> mapB(char[] arrayB, int count) {
        HashMap<Character, Integer> mapB = new HashMap<>();
        for (char s : arrayB) {
            if (mapB.containsKey(s)) {
                mapB.put(s, mapB.get(s) + 1);
            } else {
                mapB.put(s, count);
            }
        }
        return mapB;
    }

    private static HashMap<Character, Integer> mappingA(char[] arrayA, int count) {
        HashMap<Character, Integer> mapA = new HashMap<>();
        for (char c : arrayA) {
            if (mapA.containsKey(c)) {
                mapA.put(c, mapA.get(c) + 1);
            } else {
                mapA.put(c, count);
            }
        }
        return mapA;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

