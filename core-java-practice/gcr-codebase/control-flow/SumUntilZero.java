import java.util.Scanner;
// Program to sum numbers until zero is entered from user 
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// input scanner
        double total = 0.0;
        double num;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while ((num = sc.nextDouble()) != 0) {//input no and check for zero
            total += num;
            System.out.println("Enter next number (or 0 to stop):");
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
