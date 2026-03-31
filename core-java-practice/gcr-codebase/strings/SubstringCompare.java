import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");//input 4
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Create substring using charAt()
        String charAtSubstring = substringUsingCharAt(text, start, end);

        // Create substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean comparisonResult = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + comparisonResult);

        scanner.close();
    }


    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    
    // Method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }
}
