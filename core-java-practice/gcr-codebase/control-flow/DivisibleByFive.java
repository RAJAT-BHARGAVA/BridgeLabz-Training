import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        int number = scanner.nextInt();

        boolean isDivisible = (number % 5 == 0);
        String result = isDivisible ? "Yes" : "No";

        System.out.println("Is the no. " + number + " divisible by 5 ? => " + result);

        scanner.close();
    }
}
// This program checks if a given number is divisible by 5 and prints "Yes" or "No" accordingly.