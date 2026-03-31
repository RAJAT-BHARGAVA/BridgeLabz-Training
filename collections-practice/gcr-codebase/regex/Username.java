package regex;
import java.util.*;
import java.util.regex.*;
public class Username {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username(between 5 to 15 characters long including uppercase and _): ");
		String s = sc.nextLine();
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		if(matcher.matches()) {
			System.out.print("Valid username");
		}else {
			System.out.println("Invalid username");
		}
		sc.close();

	}
}
