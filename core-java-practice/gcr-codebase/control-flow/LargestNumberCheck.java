import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first no: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second no: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third no: ");
        int number3 = scanner.nextInt();

        int max = Math.max(number1, Math.max(number2, number3));

        String firstLargest = (number1 == max) ? "Yes" : "No";
        String secondLargest = (number2 == max) ? "Yes" : "No";
        String thirdLargest = (number3 == max) ? "Yes" : "No";

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        scanner.close();
    }
}
