package gradingStudents;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public List<Integer> gradingMarks(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int value : grades) {
            if (value > 35) {
                int a = ((value / 5) * 5) + 5;
                if (a - value < 3)
                    result.add(a);
                else if (a - value >= 3)
                    result.add(value);
            } else
                result.add(value);
        }
        return result;
    }
}