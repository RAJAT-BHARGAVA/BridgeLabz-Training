// Program to compute factorial of a given positive integer using while loop
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        
        if (num > 0) {// Check whether the number is a positive integer

            long factorial = 1;
            int i = 1;
            
            while (i <= num) {// Compute factorial using while loop
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + num + " is " + factorial);

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
