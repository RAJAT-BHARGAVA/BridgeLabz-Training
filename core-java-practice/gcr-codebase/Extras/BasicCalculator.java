import java.util.Scanner;

public class BasicCalculator {

    // Function for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;

            case 2:
                result = subtract(num1, num2);
                break;

            case 3:
                result = multiply(num1, num2);
                break;

            case 4:
                result = divide(num1, num2);
                break;

            default:
                System.out.println("Invalid choice!");
                
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
