import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        
        if (number > 0) {// Check if positive
            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number is not a positive integer.");
        }

        sc.close();
    }
}
