import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        handleException(input);

        scanner.close();
    }

    static void handleException(String text) {
        try {
            String result = text.substring(6, 3);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
}
