import java.util.Scanner;

public class ArrayExceptionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // You can change this to null to test NullPointerException
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index number: ");
            int index = sc.nextInt();

            // Accessing array element
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}
