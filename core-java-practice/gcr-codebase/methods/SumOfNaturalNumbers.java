
import java.util.Scanner;

public class SumOfNaturalNumbers{
	static int recursiveSum(int num) {
		if(num == 1) {
			return 1;
		}
		return num+recursiveSum(num-1);
	}
	
	static int formulaSum(int num) {
		return num*(num+1)/2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number > 0) {
			System.out.println("Natural Number");
			int sum1 = recursiveSum(number);
			int sum2 = formulaSum(number);
			if(sum1 == sum2) {
				System.out.println("Both the results are equal");
			}else {
				System.out.println("Both the results are not equal");
			}
		}else {
			System.out.println("Not A Natural Number");
		}
		input.close();
	}
}