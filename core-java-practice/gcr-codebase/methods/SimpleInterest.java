import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal Amount :    ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate :    ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the Time :    ");
        double time = scanner.nextDouble();
        calculate(principal, rate, time);
        scanner.close();
    }
    public static void calculate(double principal ,double rate,double time){
        double calculatedInterst= (principal * rate * time )/ 100;
        System.out.println("The Simple Interest is :"+ calculatedInterst + 
        " for Principal " + principal  +
        " Rate of Interest at "+ rate + "%"+
        " and Time "+ time +" years");

    }
}
