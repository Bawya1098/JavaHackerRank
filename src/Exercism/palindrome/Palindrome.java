package Exercism.palindrome;

public class Palindrome {
    boolean check(String sentence) {
        boolean result = true;
        String newSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetterOrDigit(sentence.charAt(i)))
                newSentence += sentence.toLowerCase().charAt(i);
        }
        for (int i = 0; i < newSentence.length(); i++) {
            if (newSentence.charAt(i) != newSentence.charAt(newSentence.length() - i - 1))
                result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.check(""));
        System.out.println(palindrome.check("Madam Im Adam"));
        System.out.println(palindrome.check("First ladies rule the State and state the rule: ladies first"));
        System.out.println(palindrome.check("35153"));
    }
}
