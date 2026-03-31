package regex;
import java.util.*;
import java.util.regex.*;
public class ExtractEmailAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentance having email address");
		String s = sc.nextLine();
		String regex = "^[a-z0-9_.+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		String[] words = s.split("\\s+");
		for(String word : words) {
			Matcher matcher = pattern.matcher(word);
			if(matcher.find()) {
				System.out.println(word);
			}
		}
		sc.close();

	}

}
