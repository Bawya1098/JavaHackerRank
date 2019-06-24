package arrays;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] +" ");
        }
    }
}


