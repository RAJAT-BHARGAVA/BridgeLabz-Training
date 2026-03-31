import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        //Initialize count variable
        int count = 0;

        // case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;              // increase count
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
