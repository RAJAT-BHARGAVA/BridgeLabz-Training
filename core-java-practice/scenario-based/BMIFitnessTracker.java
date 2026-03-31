import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // input of height in cm 
        System.out.println("Enter the Height :");
        double height = scanner.nextInt();
        // input of weight in kg 
        System.out.println("Enter the Weight :");
        double weight = scanner.nextInt();

        // calling the function to calculate BMI
        double calculatedBmi = calculateBmi(height, weight);


        // check the category condition 
        if(calculatedBmi<18.5){
            System.out.println("Underweight");
        }else if(calculatedBmi>18.5 && calculatedBmi<24.9){
            System.out.println("Normal weight");
        }else{
            System.out.println("overweight");
        }

        scanner.close();
    }

    // function to calculate the bmi 
    public static double calculateBmi(double heightCm, double weightKg) {
        double heightM = heightCm / 100; // convert cm to meters
        return weightKg / (heightM * heightM);
    }

}
