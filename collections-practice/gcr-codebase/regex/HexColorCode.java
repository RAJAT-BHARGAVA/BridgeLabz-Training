package regex;
import java.util.*;
import java.util.regex.*;

public class HexColorCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Hex color code (example: #ffA500 ): ");
		String s = sc.nextLine();
		String regex = "^[#][A-Fa-f0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		if(matcher.matches()) {
			System.out.println("You entered a valid hex color code");
		}else {
			System.out.println("You entered a invalid hex color code");
		}
		sc.close();
	}

}
