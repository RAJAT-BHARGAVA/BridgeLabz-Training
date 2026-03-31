import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String getInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String text) {

        text = text.replaceAll("\\s+", "").toLowerCase();  // ignore spaces & case

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Function to display output
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a Palindrome");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = getInput(scanner);
        boolean palindrome = isPalindrome(input);
        displayResult(input, palindrome);

        scanner.close();
    }
}
