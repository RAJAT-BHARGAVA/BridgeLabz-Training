import java.util.Scanner;

public class HeightConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        scanner.close();
    }
}
