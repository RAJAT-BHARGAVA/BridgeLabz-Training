import java.util.Scanner;

public class StoreTheMarksOfPCMInTwoDArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + " (Physics Chemistry Maths):");

            for (int j = 0; j < 3; j++) {
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Enter marks between 0 and 100 only.");
                    j--; // re-enter value
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'R';
            } else {
                grades[i] = 'E';
            }
        }

        // Output
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf(
                "%d\t%d\t%d\t\t%d\t%.2f\t\t%c%n",
                (i + 1),
                marks[i][0],
                marks[i][1],
                marks[i][2],
                percentages[i],
                grades[i]
            );
        }

        scanner.close();
    }
}
