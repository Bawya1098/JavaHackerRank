package factorial;

import java.util.Scanner;

public class result {
    static int factorial(int n) {
        int result;
        if (n == 1 || n == 0) {
            return 1;
        } else {
            result = n * factorial(n - 1);
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}



