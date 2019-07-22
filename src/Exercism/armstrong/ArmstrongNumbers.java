package Exercism.armstrong;


public class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        boolean isChecked = false;
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = numberToCheck;
        for (; originalNumber != 0; originalNumber /= 10, ++n) ;
        originalNumber = numberToCheck;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if (result == numberToCheck)
            isChecked = true;
        return isChecked;
    }


    public static void main(String[] args) {
        ArmstrongNumbers arms = new ArmstrongNumbers();
        System.out.println(arms.isArmstrongNumber(4949));
        System.out.println(arms.isArmstrongNumber(153));
        System.out.println(arms.isArmstrongNumber(9926314));

    }
}