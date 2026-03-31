import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(n);
        }

        scanner.close();
    }

    public static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        //1 or 2 handled separately
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }

        // Generate remaining terms
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    
}
