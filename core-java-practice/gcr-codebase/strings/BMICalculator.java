import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for each person
    public static String[][] calculateBMIAndStatus(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Call methods
        String[][] result = calculateBMIAndStatus(data);
        displayResult(result);

        scanner.close();
    }
}
