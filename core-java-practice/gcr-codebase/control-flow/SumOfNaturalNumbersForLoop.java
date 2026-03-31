import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a Natural Number
        if (n > 0) {

            // Using formula
            int formulaSum = n * (n + 1) / 2;

            // Using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            // Display results
            System.out.println("Sum using for loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Compare both results
            if (loopSum == formulaSum) {
                System.out.println("Result is correct. Both computations match.");
            } else {
                System.out.println("Result is incorrect. Computations do not match.");
            }

        } else {
            System.out.println("The number " + n + " is not a Natural Number.");
        }

        sc.close();
    }
}
// Program to sum natural numbers up to a given number n using for loop