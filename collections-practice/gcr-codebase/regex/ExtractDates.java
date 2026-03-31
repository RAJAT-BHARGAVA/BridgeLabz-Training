package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentance");
		String s = sc.nextLine();
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()) {
			System.out.print(matcher.group()+", ");
		}
		sc.close();
	}

}
