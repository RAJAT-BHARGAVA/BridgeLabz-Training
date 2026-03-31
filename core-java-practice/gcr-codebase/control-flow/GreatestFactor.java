import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            int greatestFactor = 1; // Initialize greatest factor

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // stop at the first (largest) factor
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        } else {
            System.out.println("The number is not a positive integer.");
        }

        sc.close();
    }
}
