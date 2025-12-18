public class penDistribution {
    public static void main(String[] args) {
        int totalPens = 14; // Total number of pens
        int students = 3; // Number of students
        int pensPerStudent = totalPens / students; // Pens each student gets
        int remainingPens = totalPens % students; // Remaining pens after distribution
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pens not distributed is " + remainingPens);
    }
}
