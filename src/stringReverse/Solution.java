package stringReverse;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] array = A.toCharArray();
        char[] result = new char[array.length];
        for (int j = 0; j < result.length; j++) {
            for (int i = array.length - 1; i >= 0; i--) {
                result[j] = array[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
