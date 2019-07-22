package PigLatin;

import java.util.Arrays;
import java.util.List;

public class pigLatinTranslator {
    List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    String result = "";

    String translate(String word) {
        char[] resultArray = word.toCharArray();
        if (vowels.contains(resultArray[0])) {
            result = word + "ay";
        } else {
            for (int i = 0; i < resultArray.length; i++) {
                result = changeString(word, i);
            }
        }
        return result;
    }

    private String changeString(String word, int i) {

        return null;
    }


    public static void main(String[] args) {
        pigLatinTranslator pigLatinTranslator = new pigLatinTranslator();
//        System.out.println(pigLatinTranslator.translate("object"));
        System.out.println(pigLatinTranslator.translate("ball"));
    }

}
