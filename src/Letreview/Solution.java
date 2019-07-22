package Letreview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine();
            words.add(getIndexed(sentence));
        }
        displaywords(words);
    }

    private static void displaywords(List<String> words) {
        for (String wrd : words) {
            System.out.println(wrd);
        }
    }

    private static String getIndexed(String s) {
        String result = "";
        int length = s.length();
        String even = getevenIndex(s, result, length);
        String odd = getOddIndex(s, result, length);
        return even + " " + odd;
    }

    private static String getevenIndex(String s, String result, int length) {
        for (int j = 0; j < length; j++) {
            if (j % 2 == 0) {
                result += s.charAt(j);
            }
        }
        return result;
    }

    private static String getOddIndex(String s, String result, int length) {
        for (int j = 0; j < length; j++) {
            if (j % 2 != 0) {
                result += s.charAt(j);
            }
        }
        return result;
    }


}

