import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input from user
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();


        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI 
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);
        // Determine BMI category
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } 
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
