import java.util.Scanner;

public class LargestSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        //  STORE DIGITS (DYNAMIC ARRAY GROWTH)
        while (number != 0) {

            // Increase array size if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // Copy old array elements to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // reassign reference
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // FIND LARGEST & SECOND LARGEST
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

        //  OUTPUT 
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        scanner.close();
    }
}
