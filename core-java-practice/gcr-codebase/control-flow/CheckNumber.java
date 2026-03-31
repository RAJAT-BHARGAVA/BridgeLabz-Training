import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();//input no
        if(num==0){// check no is zero
            System.out.println("zero ");
        } else if(num>0){ // check no is positive
            System.out.println(" positive ");
        }else{
            System.out.println(" negetive ");
        }
        sc.close();
    }
}
