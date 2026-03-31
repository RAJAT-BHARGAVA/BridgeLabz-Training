import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        scanner.close();
    }


    public static boolean isPrime(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;   // Not prime
            }
        }

        return true; 
    }
}
