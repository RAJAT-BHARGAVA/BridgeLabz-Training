import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;           // Base condition
        }
        return n * factorial(n - 1);   // Recursive call
    }

    // Function to take input
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Function to display result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = getInput(scanner);

        if (num < 0) {
            System.out.println("Factorial of negative numbers is not defined.");
        } else {
            long fact = factorial(num);
            displayResult(num, fact);
        }

        scanner.close();
    }
}
