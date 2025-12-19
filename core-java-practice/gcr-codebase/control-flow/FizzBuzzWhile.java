import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 0) {

            int i = 1; // initialize counter
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++; // increment counter
            }

        } else {
            System.out.println("The number is not a positive integer");
        }

        sc.close();
    }
}
