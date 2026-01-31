import java.util.*;

public class LexicalTwist {

    public static boolean isValidWord(String word) {
        return !word.contains(" ");
    }

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (!isValidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (!isValidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Check reverse (case insensitive)
        String reversedFirst =
                new StringBuilder(first).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(second)) {

            // Reverse → lowercase → replace vowels
            String result = reversedFirst.toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(result);

        } else {

            // Combine and uppercase
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;

            for (char ch : combined.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (isVowel(ch))
                        vowels++;
                    else
                        consonants++;
                }
            }

            if (vowels > consonants) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (isVowel(ch))
                        set.add(ch);
                }
                printFirstTwo(set);

            } else if (consonants > vowels) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (char ch : combined.toCharArray()) {
                    if (Character.isLetter(ch) && !isVowel(ch))
                        set.add(ch);
                }
                printFirstTwo(set);

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    private static void printFirstTwo(Set<Character> set) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
            count++;
            if (count == 2)
                break;
        }
        System.out.println(sb.toString());
    }
}
