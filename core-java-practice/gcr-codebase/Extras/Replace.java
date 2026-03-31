import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String oldWord = sc.nextLine();
        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();
        String modifiedSentence = sentence.replace(oldWord, newWord);
        System.out.println("Modified sentence: " + modifiedSentence);
        sc.close();
    }
}