import java.util.Scanner;

public class Leetcode69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Mysqrt(x));
    }
    public static int Mysqrt(int x){
        int result = (int)Math.sqrt(x);
        return result;
    }
}
