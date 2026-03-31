package regex;
import java.util.*;
public class CreditCardNumber {
	public static boolean isVisa(String card) {
        return card.matches("^4\\d{15}$");
    }

    public static boolean isMasterCard(String card) {
        return card.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter card number:");
        String card1 = sc.nextLine();
        String card2 = sc.nextLine();

        System.out.println("Visa valid: " + isVisa(card1));
        System.out.println("MasterCard valid: " + isMasterCard(card2));
        sc.close();
    }
}
