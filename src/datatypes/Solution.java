package datatypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = s + s2;
        System.out.println();
        System.out.println(i + i2 + "\n" + (d + d2) + "\n" + s3);


        scan.close();
    }
}

