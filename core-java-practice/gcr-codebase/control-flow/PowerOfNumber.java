import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();

        // Check if both numbers are positive
        if (number >= 0 && power >= 0) {

            int result = 1; // Initialize result

            // Loop from 1 to power
            for (int i = 1; i <= power; i++) {
                result *= number; // Multiply result by number
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);

        } else {
            System.out.println("Both base and power should be positive integers.");
        }

        sc.close();
    }
}
