package palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int j = 0;
        char[] arrayA = A.toCharArray();
        char[] arrayB = new char[arrayA.length];
        for (int i = arrayA.length; i > 0; i--) {
            arrayB[j] = arrayA[i - 1];
            j += 1;
        }
        if (Arrays.equals(arrayA, arrayB)) {
            System.out.println("Yes");
        }
    }
}


