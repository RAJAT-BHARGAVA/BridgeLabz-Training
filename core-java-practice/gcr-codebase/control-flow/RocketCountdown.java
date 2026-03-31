import java.util.Scanner;
// Program to perform a rocket countdown using a while loop
public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown number:");
        int counter = sc.nextInt();// input countdown number
        while (counter >= 1) {// loop until counter is 1
            System.out.println(counter);
            counter--;//decrement 
        }
        System.out.println("Launch!");
        sc.close();
    }
}