public class Reverse {
    public static void main(String[] args) {
        String str = "ANUJ";
        String ans = "";
        for(int i=str.length()-1;i>=0;i--){
            ans += str.charAt(i);
        }
        System.out.print(ans);
    }
}

