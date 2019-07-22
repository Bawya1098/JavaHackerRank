package Exercism.luhnValidator;

public class LuhnValidator {
    int digitSum(char[] chars) {
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }

        return sum;
    }

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("\\s", "");

        if (candidate.matches("[a-zA-Z\\-]"))
            return false;

        if (candidate.length() <= 1)
            return false;

        char[] chars = candidate.toCharArray();

        for (int i = candidate.length() - 2; i >= 0; i -= 2) {
            int currentDigit = Character.getNumericValue(chars[i]);

            currentDigit *= 2;
            if (currentDigit > 9)
                currentDigit -= 9;

            chars[i] = Character.forDigit(currentDigit, 10);
        }

        if (digitSum(chars) % 10 == 0)
            return true;
        return false;
    }
}
