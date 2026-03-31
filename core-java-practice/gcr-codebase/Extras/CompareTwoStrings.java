import java.util.Scanner;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        int Result = 0;
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 != ch2) {
                Result = ch1 - ch2;
                break;
            }
        }
        if (Result == 0) {
            if (str1.length() == str2.length()) {
                System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
            } else if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            }
        } else if (Result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        }
        sc.close();
    }
}