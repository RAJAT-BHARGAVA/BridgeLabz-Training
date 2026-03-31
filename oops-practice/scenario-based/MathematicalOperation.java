package scenario_based;
import java.util.*;

class Methods {
	public int factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	public void checkPrime(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				System.out.println("Number is prime");
				return;
			}
		}
		System.out.println("Number is not prime");
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;
	}

	public void printFibonacci(int number) {
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < number; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}

public class MathematicalOperation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Number = ");
		int number = input.nextInt();
		Methods method = new Methods();
		System.out.println(method.factorial(number));
		method.checkPrime(number);
		System.out.println("Enter the 2 number for find the greatest Common factors");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(method.gcd(a, b));
		method.printFibonacci(number);
		input.close();
	}
}
