package Exercism.series;

import java.util.ArrayList;
import java.util.List;

public class Series {
    String number;

    public Series(String number) {
        this.number = number;
    }

    List<String> slices(int num) {
        List<String> strings = new ArrayList<>();
        if (number.length() == num) {
            strings.add(number);
        } else if (number.length() < num || number.length() == 0) {
            throw new IllegalArgumentException("Slice size is too big.");
        } else if (num <= 0) {
            throw new IllegalArgumentException("Slice size is too small.");
        } else {
            for (int i = 0; i < number.length() - 1; i++) {
                int endIndex = i + num;
                if (endIndex >= (number.length() + 1)) {
                    break;
                }
                String substring = number.substring(i, endIndex);
                strings.add(substring);
            }
        }
        return strings;
    }

    void display(int num) {
        List<String> strings = slices(num);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Series series = new Series("12");
        series.display(1);
    }
}
