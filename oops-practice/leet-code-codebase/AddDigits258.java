package leet_code_codebase;
import java.util.Scanner;

public class AddDigits258 {
	public int addDigits(int num) {
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		AddDigits258 ad = new AddDigits258();
		System.out.println(ad.addDigits(num));
		input.close();
	}

}
