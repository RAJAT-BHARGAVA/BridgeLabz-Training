import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int originalNumber = number; // to keep original value
        int sum = 0;

        //  Use while loop to access each digit
        while (number != 0) {

            //Get last digit
            int digit = number % 10;

            // Add digit 
            sum = sum + digit;

            //  Remove last digit
            number = number / 10;
        }

        // Check Harshad condition
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        sc.close();
    }
}
