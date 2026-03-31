import java.util.Scanner;

public class HandShake {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of students :  ");
        int numberOfStudents = scanner.nextInt();
        calculateHandshake(numberOfStudents);
        scanner.close();

    }
    public static void calculateHandshake(int n){
        int res =  (n * (n - 1)) / 2;
        System.out.println("Possible no of handshakes are : "+res);
    }
}
