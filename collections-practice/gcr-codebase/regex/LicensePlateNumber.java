package regex;
import java.util.*;
import java.util.regex.*;
public class LicensePlateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter licence plate number(eg.. AB1234): ");
		String s = sc.nextLine();
		String regex = "^[A-Z]{2}[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		if(matcher.matches()) {
			System.out.println("Valid number");
		}else {
			System.out.println("Invalid number");
		}
		sc.close();
	}

}
