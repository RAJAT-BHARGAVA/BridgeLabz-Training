import java.util.Scanner;

public class Reverse {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string here :    ");
        String string = scanner.nextLine();
        for(int i = string.length()-1; i>=0 ;i--){
            System.out.print(string.charAt(i));
        }
        scanner.close();
    }
}
