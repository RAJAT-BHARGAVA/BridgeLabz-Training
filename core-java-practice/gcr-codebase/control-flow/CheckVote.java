import java.util.Scanner;
public class CheckVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("The person's age is "+ age +", so you are eligible to vote.");
        } else {
            System.out.println("The person's age is "+ age +", so you are not eligible to vote.");
        }

        sc.close();
    }
}
