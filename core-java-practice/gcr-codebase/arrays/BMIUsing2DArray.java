import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // 2D array to store height, weight, BMI
        // index 0 → height (cm)
        // index 1 → weight (kg)
        // index 2 → BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Input height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input with validation
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Please enter a positive value.");
            }

            // Height input with validation
            while (true) {
                System.out.print("Enter height (cm): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Please enter a positive value.");
            }

            // Convert height to meters
            double heightInMeters = personData[i][0] / 100;

            // Calculate BMI
            personData[i][2] =
                    personData[i][1] / (heightInMeters * heightInMeters);

            // Find weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        scanner.close();
    }
}
