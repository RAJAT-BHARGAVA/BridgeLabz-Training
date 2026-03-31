import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Compute the operations considering operator precedence
        double res1 = a + b * c;  // * has higher precedence, so b*c first, then +a
        double res2 = a * b + c;  // * has higher precedence, so a*b first, then +c
        double res3 = c + a / b;  // / has higher precedence, so a/b first (floating-point division), then +c
        double res4 = a % b + c;  // % has higher precedence, so a%b first, then +c

        System.out.println("The results of Double Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
        
        scanner.close();
    }
}
