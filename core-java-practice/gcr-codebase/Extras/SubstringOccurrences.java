import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = countOccurrences(str, sub);
        System.out.println("Occurrences: " + count);
        sc.close();
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count;
    }
}
