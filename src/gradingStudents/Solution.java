package gradingStudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();
        int size = scanner.nextInt();
        scanner.nextLine();
        List<Integer> grades = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            grades.add(element);
        }
        List<Integer> gradeStudents = result.gradingMarks(grades);
        for (int value : gradeStudents) {
            System.out.println(value);
        }
    }
}
