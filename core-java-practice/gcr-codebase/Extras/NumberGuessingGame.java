import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // To generate a random guess within current range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // To take feedback from user
    public static String getFeedback(Scanner scanner) {
        System.out.print("Is the guess High (H), Low (L), or Correct (C)? : ");
        return scanner.next().toUpperCase();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            
            guess = generateGuess(low, high);
            System.out.println("My Guess: " + guess);

            feedback = getFeedback(scanner);

            if (feedback.equals("C")) {
                System.out.println("Yay! I guessed your number correctly");
                break;
            }
            else if (feedback.equals("H")) {
                high = guess - 1;   // reduce upper bound
            }
            else if (feedback.equals("L")) {
                low = guess + 1;    // increase lower bound
            }
            else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }

            if (low > high) {
                System.out.println("Something went wrong! Did you give wrong Please hints");
                break;
            }
        }

        scanner.close();
    }
}
