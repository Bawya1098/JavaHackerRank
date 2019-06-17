package sockMerchant;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SockMerchant sockMerchant = new SockMerchant();

        int n = scanner.nextInt();

        scanner.nextLine();

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant.sockMerchant(ar);
        System.out.println(result);

    }
}
