import java.util.Scanner;

public class LargestSecondLargestDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;

        
        int[] digits = new int[maxDigit];

        int index = 0;

        // STORE DIGITS
        while (number != 0) {

            if (index == maxDigit) {
                break; // stop if array size reached
            }

            int lastDigit = number % 10;
            digits[index] = lastDigit;

            index++;
            number = number / 10;
        }

        //CHECK LARGEST & SECOND LARGEST 
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // OUTPUT
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        scanner.close();
    }
}
