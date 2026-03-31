import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { // Check if divisible by number
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number must be a positive integer less than 100.");
        }

        sc.close();
    }
}
