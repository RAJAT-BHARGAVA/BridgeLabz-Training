import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        double[] weights = new double[n];   // in kg
        double[] heights = new double[n];   // in cm
        double[] BMIs = new double[n];
        String[] weightStatuses = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            heights[i] = scanner.nextDouble();

            // Convert height from cm to meters
            double heightInMeters = heights[i] / 100;

            // Correct BMI formula
            BMIs[i] = weights[i] / (heightInMeters * heightInMeters);

            // Correct BMI classification
            if (BMIs[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (BMIs[i] >= 18.5 && BMIs[i] < 25) {
                weightStatuses[i] = "Normal";
            } else if (BMIs[i] >= 25 && BMIs[i] < 30) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    heights[i], weights[i], BMIs[i], weightStatuses[i]);
        }

        scanner.close();
    }
}
