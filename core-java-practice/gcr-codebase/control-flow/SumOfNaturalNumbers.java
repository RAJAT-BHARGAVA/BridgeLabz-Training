import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        
        if (n > 0) {// Check whether the number is a natural number

            // Using formula
            int formulaSum = n * (n + 1) / 2;

            // Using while loop
            int loopSum = 0;
            int i = 1;

            while (i <= n) {
                loopSum = loopSum + i;
                i++;
            }

            // Display results
            System.out.println("Sum using while loop: " + loopSum);
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
// Program to sum natural numbers up to a given number n