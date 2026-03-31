package regex;
import java.util.*;
import java.util.regex.*;
public class ExtractCapitalizedWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String s = sc.nextLine();
//		String regex = "^[A-Z].*";
//		Pattern pattern = Pattern.compile(regex);
//		String[] words = s.split("\\s+");
//		for(String word: words) {
//			Matcher matcher = pattern.matcher(word);
//			if(matcher.find()) {
//				System.out.print(word+", ");
//			}
//			
//		}
		String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
		sc.close();
	}

}
