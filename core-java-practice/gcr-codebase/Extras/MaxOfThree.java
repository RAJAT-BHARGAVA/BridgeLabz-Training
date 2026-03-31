import java.util.Scanner;
public class MaxOfThree {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 3 number using enter");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        check(num1, num2, num3);
        scanner.close();
    }
    public static void check(int num1 , int num2 ,int num3){
        if(num1>num2 && num1>num3 ){
            System.out.println("the maximum of 3 :   "+num1);
        }else if(num2>num1 && num2 > num3){
            System.out.println("the maximum of 3 :  "+num2);
        }else{
            System.out.println("the maximum of 3 :  "+num3);
        }
    }
}
