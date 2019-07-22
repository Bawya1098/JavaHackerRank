package arrays;

public class ReverseString {
    String reverse(String inputString) {
        String string = "";
        if (inputString.equals("")) {
            return string;
        } else {
            char[] array = inputString.toCharArray();
            char[] result = new char[array.length];
                for (int i = array.length - 1; i >= 0; i--) {
                    result[array.length-(i+1)] = array[i];
                }
            string = new String(result);
            return string;
        }
    }

    public static void main(String[] args) {
        ReverseString rsv = new ReverseString();
        String result = rsv.reverse("Ramen");
        System.out.println("I'm hungry!" + rsv.reverse("I'm hungry!"));
        System.out.println("Ramen" + result);
        System.out.println("racecar" + rsv.reverse("racecar"));

    }
}
