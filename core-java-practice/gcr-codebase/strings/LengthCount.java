import java.util.Scanner;

public class LengthCount {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // user input 
        System.out.print("Enter the String here :");
        String string = scanner.next();

        // length finding using own method 
        System.out.println("The length of string via using own method : "+findLength(string));

        // length finding form pre def method
        int builtInLength = string.length();
        System.out.println( "The length of string via using inBulit method : "+ builtInLength);
        scanner.close();
    }

     public static int findLength(String str) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                str.charAt(count);  // Access each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
            return count;
        }
    }
}
