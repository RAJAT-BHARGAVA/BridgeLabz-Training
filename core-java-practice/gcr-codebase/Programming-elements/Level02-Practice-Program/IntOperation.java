import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Compute the operations considering operator precedence
        int result1 = a + b * c;  // * has higher precedence, so b*c first, then +a
        int result2 = a * b + c;  // * has higher precedence, so a*b first, then +c
        int result3 = c + a / b;  // / has higher precedence, so a/b first (integer division), then +c
        int result4 = a % b + c;  // % has higher precedence, so a%b first, then +c

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        scanner.close();
    }
}
