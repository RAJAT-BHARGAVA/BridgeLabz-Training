import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        
        if (number > 0) {// Check if positive
            System.out.println("Factors of " + number + " are:");

            int i = 1; // counter

            
            while (i < number) {// While loop
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // increment counter
            }

        } else {
            System.out.println("The number is not a positive integer.");
        }

        sc.close();
    }
}
