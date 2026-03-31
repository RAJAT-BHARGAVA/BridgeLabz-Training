import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();

        // Check for non-negative integers
        if (number >= 0 && power >= 0) {

            int result = 1; // Initialize result
            int counter = 0; // Initialize counter

            // Loop until counter equals power
            while (counter < power) {
                result *= number; // Multiply result by number
                counter++; // Increment counter
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);

        } else {
            System.out.println("Both base and power should be non-negative integers.");
        }

        sc.close();
    }
}
