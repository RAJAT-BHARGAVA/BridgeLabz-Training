import java.util.Scanner;

public class ToggleCaseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = toggle(input);
        System.out.println("After toggling: " + toggled);
        sc.close();
    }


    public static String toggle(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));   // convert to lowercase
            }
            else if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));   // convert to uppercase
            }
            else {
                result.append(ch);   // keep other characters same
            }
        }
        return result.toString();
    }
}
