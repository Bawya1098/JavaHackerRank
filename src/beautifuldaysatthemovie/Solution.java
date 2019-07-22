package beautifuldaysatthemovie;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    static void beautifulDays(int i, int j, int k) {
        int reversed = 0;
        int[] arr = new int[3];
        for (int z = 0; z < arr.length; z++) {
            arr[z] = getreversed(i, j, k, reversed);
        }


//    }

    }

    private static int getreversed(int i, int j, int k, int reversed) {
        int result = 0;
        for (int index = i; index <= j; index++) {
            for (; i != 0; i /= 10) {
                int digit = i % 10;
                reversed = reversed * 10 + digit;
            }
            result = abs(i - reversed) / k;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

//        int result = beautifulDays(i, j, k);

    }
}

