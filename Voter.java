import java.util.Scanner;

class SafetyException extends Exception{
    public SafetyException (String message){
        super(message);
    }
} 
public class Voter {
    public static void main(String[] args)throws SafetyException {
        System.out.println("Please Enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age <18){
            throw new SafetyException("Invalid age to vote");
        }
        else{
            System.out.println("you are Eligible to vote .");
        }
    }
}
