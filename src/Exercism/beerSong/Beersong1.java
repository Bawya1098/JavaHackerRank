package Exercism.beerSong;

public class Beersong1 {
    String sing(int startNum, int numberOfVerses) {
        StringBuilder sb = new StringBuilder();
        while (numberOfVerses > 0) {
            numberOfVerses--;
            if (startNum > 2) {
                sb.append(startNum).append(" bottles of beer on the wall, ").append(startNum).append(" bottles of beer.\n");
                startNum--;
                sb.append("Take one down and pass it around, ").append(startNum).append(" bottles of beer on the wall.\n\n");
            } else if (startNum == 2) {
                sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n");
                sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
                startNum--;
            } else if (startNum == 1) {
                sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
                startNum--;
                sb.append("Take it down and pass it around, no more bottles of beer on the wall.\n\n");
            } else {
                startNum = 99;
                sb.append("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            }
        }
        return sb.toString();
    }

    String singSong() {
        return sing(99, 100);
    }

    public static void main(String[] args) {
        Beersong1 bs1 = new Beersong1();
        System.out.println(bs1.sing(99, 100));
    }
}

