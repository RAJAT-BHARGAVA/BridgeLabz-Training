import java.util.Scanner;
// Program to sum natural numbers until a zero or negative number is entered from user

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // break condition
            if (num <= 0) {
                break;
            }

            sum  += num;
        }

        System.out.println("The sum of entered natural numbers is: " + sum);
        sc.close();
    }
}