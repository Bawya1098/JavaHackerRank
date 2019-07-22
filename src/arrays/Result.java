package arrays;

public class Result {
    public static void main(String[] args) {
        int[] elements = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int min = elements[0];
        int second_min = elements[1];
        for (int i = 2; i < elements.length; i++) {
            if (second_min > elements[i] && min < elements[i]) {
                min = min;
                second_min = elements[i];
            }
        }
        System.out.println("smallest :" + min);
        System.out.println("secondSmallest: " + second_min);
    }
}
