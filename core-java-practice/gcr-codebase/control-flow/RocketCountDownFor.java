import java.util.Scanner;
// Program to perform a rocket countdown using a for loop
public class RocketCountDownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown number:");
        int counter = sc.nextInt();// input countdown number
        for (int i = counter; i >= 1; i--) {// loop until counter is 1
            System.out.println(i);
        }
        System.out.println("Launch!");
        sc.close();
    }
}
