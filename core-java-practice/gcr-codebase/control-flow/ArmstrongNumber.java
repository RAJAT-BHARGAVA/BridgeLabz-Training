import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;  // store original value
        int sum = 0;                  // to store sum of cubes

        // Step 3: Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Step 4: Get last digit using modulus operator
            int digit = originalNumber % 10;

            // Step 5: Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Step 6: Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Step 7: Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}
