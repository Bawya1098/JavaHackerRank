package loops;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " x " + i + " = " + (n * i)+"\n");
        }
    }
}
