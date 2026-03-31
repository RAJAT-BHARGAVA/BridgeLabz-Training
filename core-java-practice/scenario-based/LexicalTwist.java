import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String firstWord = sc.nextLine();
        
        // Validation for First Word
        if (firstWord.trim().contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String secondWord = sc.nextLine();

        // Validation for Second Word
        if (secondWord.trim().contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // Logic 1: Check if second word is reversed version of first (Case Insensitive)
        String reversedFirst = new StringBuilder(firstWord).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(secondWord)) {
            // Step: Reverse first, lowercase it, replace vowels with '@'
            String transformed = reversedFirst.toLowerCase().replaceAll("[aeiouAEIOU]", "@");
            System.out.println(transformed);
        } else {
            // Logic 2: Combine and analyze
            String combined = (firstWord + secondWord).toUpperCase();
            int vowelsCount = 0;
            int consonantsCount = 0;
            
            String vowelsList = "AEIOU";
            
            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (vowelsList.indexOf(c) != -1) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }

            if (vowelsCount > consonantsCount) {
                printFirstTwoUnique(combined, true);
            } else if (consonantsCount > vowelsCount) {
                printFirstTwoUnique(combined, false);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    // Helper method to extract first 2 unique vowels or consonants
    public static void printFirstTwoUnique(String word, boolean wantVowels) {
        String vowels = "AEIOU";
        Set<Character> seen = new LinkedHashSet<>();
        
        for (char c : word.toCharArray()) {
            boolean isVowel = vowels.indexOf(c) != -1;
            if (wantVowels && isVowel) {
                seen.add(c);
            } else if (!wantVowels && !isVowel && Character.isLetter(c)) {
                seen.add(c);
            }
            
            if (seen.size() == 2) break;
        }
        
        for (Character ch : seen) {
            System.out.print(ch);
        }
        System.out.println();
    }
}