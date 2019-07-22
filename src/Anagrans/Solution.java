package Anagrans;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> factorSet = new HashSet<>();
    String result = "";

    private String convert(int number) {
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factorSet.add(i);
            }
        }
        for (Integer n : factorSet) {
            switch (n) {
                case (3):
                    result += "Pling";
                    break;
                case (5):
                    result += "Plang";
                    break;
                case (7):
                    result += "Plong";
                    break;
            }
        }
        if (result.equals("")) result += number;
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
//        System.out.println(sol.convert(15));
        System.out.println(sol.convert(34));
//        System.out.println(sol.convert(5));
//        System.out.println(sol.convert(7));
//        System.out.println(sol.convert(6));
//        System.out.println(sol.convert(105));
    }
}

