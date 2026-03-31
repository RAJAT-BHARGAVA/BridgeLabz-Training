import java.util.Scanner;

public class Anagram {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first string ");
        String str1= scanner.nextLine();
        System.out.println("Enter your second string ");
        String str2= scanner.nextLine();


        
        if (isAnagram(str1, str2)) {
            System.out.println("The given texts are Anagrams.");
        } else {
            System.out.println("The given texts are NOT Anagrams.");
        }
        scanner.close();



    }

    // method to check the managram or not  
    public static boolean isAnagram(String text1, String text2) {

        // Remove spaces and convert to lowercase
        text1 = text1.replace(" ", "").toLowerCase();
        text2 = text2.replace(" ", "").toLowerCase();

        // Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency array 
        int[] freq = new int[26];

        // Find frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i) - 'a']++;
            freq[text2.charAt(i) - 'a']--;
        }

        // Compare frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
}
