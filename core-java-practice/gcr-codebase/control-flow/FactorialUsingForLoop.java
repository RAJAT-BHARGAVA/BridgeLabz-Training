import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check whether the number is a Natural Number
        if (num > 0) {

            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is " + factorial);

        } else {
            System.out.println("Please enter a Natural Number greater than 0.");
        }

        sc.close();
    }
}
// Program to compute factorial of a given positive integer using for loop