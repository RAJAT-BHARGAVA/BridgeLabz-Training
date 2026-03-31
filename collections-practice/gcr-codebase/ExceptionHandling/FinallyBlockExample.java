import java.util.Scanner;

public class FinallyBlockExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Performing division
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Cannot divide by zero");
        }
        finally {
            // Always executes
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
