import java.util.Scanner;

public class SplitTextIntoWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input using nextLine()
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Custom split logic
        String[] customWords = customSplit(text);

        // Built-in split method
        String[] builtInWords = text.split(" ");

        // Display custom split result
        System.out.println("\nWords using custom split method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        // Display built-in split result
        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        scanner.close();
    }

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }
}
