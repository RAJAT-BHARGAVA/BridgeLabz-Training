import java.util.Scanner;

public class ShortestLongestWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();


        String[] words = customSplit(text);
        String[][] wordLengthArray = createWordLengthTable(words);
        int[] resultIndexes = findShortestAndLongest(wordLengthArray);


        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(
                wordLengthArray[i][0] + "\t\t" +
                Integer.parseInt(wordLengthArray[i][1])
            );
        }

        System.out.println("\nShortest Word : " +
                wordLengthArray[resultIndexes[0]][0]);

        System.out.println("Longest Word  : " +
                wordLengthArray[resultIndexes[1]][0]);

        scanner.close();
    }


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

    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }


        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(table[0][1]);
        int longestLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }
}
