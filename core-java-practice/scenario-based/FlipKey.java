import java.util.Scanner;

public class FlipKey {

	static String cleanseAndInvert(String word) {
		if (word.length() < 6) {
			return null;
		}
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == ' ' || !Character.isLetter(ch)) {
				return null;
			}
		}
		// Password Generation
		StringBuilder sb = new StringBuilder();
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!(ch % 2 == 0)) {
				sb.append(ch);
			}
		}
		String str = sb.reverse().toString();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				result += Character.toUpperCase(ch);
			} else {
				result += ch;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Word:");
		String word = input.nextLine().trim();
		String key = cleanseAndInvert(word);
		if (key == null) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("The generated key is - " + key);
		}
		input.close();
	}
}