import java.util.Scanner;
public class RemoveSpecificCharacterFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.nextLine().charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != charToRemove) {
                result.append(ch);
            }
        }
        System.out.println("Modified string: " + result.toString());
        sc.close();
    }
}