import java.util.Scanner;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
       
        for (int i = 0; i < s.length(); i++) {
            int len1 = check(s, i, i);     // for odd 
            int len2 = check(s, i, i + 1); // for even 
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end +1);
    }

    private static int check(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the String");
        String str = input.nextLine();
        
        System.out.println(longestPalindrome(str));
        
    }
}
