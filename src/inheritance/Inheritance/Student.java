package inheritance.Inheritance;

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }


    public String calculate() {
        int sum = 0;
        String result = "";
        for (int testScore : testScores) {
            sum += testScore;
        }
        int avg = (sum / testScores.length);
        if (avg >= 90 && avg <= 100)
            result = "O";
        else if (avg >= 80 && avg <= 90)
            result = "E";
        else if (avg >= 70 && avg <= 80)
            result = "A";
        else if (avg >= 55 && avg <= 75)
            result = "P";
        else if (avg >= 40 && avg <= 55)
            result = "D";
        else if (avg < 40)
            result = "T";
        return result;
    }

}
