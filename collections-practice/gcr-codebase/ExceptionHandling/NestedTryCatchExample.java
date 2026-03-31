import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        try {
            // Outer try: Access array index
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            int value = arr[index];  // May throw ArrayIndexOutOfBoundsException

            try {
                // Inner try: Divide the value
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                int result = value / divisor; // May throw ArithmeticException
                System.out.println("Division Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        finally {
            sc.close();
        }
    }
}
