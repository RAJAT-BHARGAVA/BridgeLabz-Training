import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 1; // Start from 1

            // While loop till counter <= 100
            while (counter <= 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++; // Increment counter
            }

        } else {
            System.out.println("The number must be a positive integer less than 100.");
        }

        sc.close();
    }
}
