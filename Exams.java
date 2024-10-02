public class Exams {
    public static void main(String[] args) {
        int aliceExam1 = 90;
        int aliceExam2 = 60;
        int aliceExam3 = 80;

        int bobExam1 = 50;
        int bobExam2 = 0;
        int bobExam3 = 30;

        int cliveExam1 = 60;
        int cliveExam2 = 70;
        int cliveExam3 = 75;

        char aliceGrade = finalGrade(aliceExam1, aliceExam2, aliceExam3);
        char bobGrade = finalGrade(bobExam1, bobExam2, bobExam3);
        char cliveGrade = finalGrade(cliveExam1, cliveExam2, cliveExam3);

        System.out.println("Alice's final grade: " + aliceGrade);
        System.out.println("Bob's final grade: " + bobGrade);
        System.out.println("Clive's final grade: " + cliveGrade);
    }

    public static char finalGrade(int ex1, int ex2, int ex3) {
        int avg = (ex1+ex2+ex3)/3;

        if (avg > 80) {
            return 'A';
        } else if (avg > 60) {
            return 'B';
        } else if (avg > 40) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
