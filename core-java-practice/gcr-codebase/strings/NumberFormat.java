import java.util.Scanner;

public class NumberFormat{
	public static void generateException(String text) {
		 int integer = Integer.parseInt(text);
		 System.out.println(integer);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		try {
			generateException(text);
		}catch (NumberFormatException e) {
			System.err.println("NumberFormatException caught");
		}catch (RuntimeException e) {
			System.err.println("RuntimeException caught");
		}
		input.close();
	}
}