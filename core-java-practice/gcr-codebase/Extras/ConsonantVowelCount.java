import java.util.Scanner;
public class ConsonantVowelCount {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string here : ");
        String str = scanner.nextLine();
        count(str);
        scanner.close();

    }
    public static void count(String string){
        String str = string.toLowerCase();
        int vowelCount =0; 
        int consonantCount =0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        System.out.println("The total count of :    "+vowelCount);
        System.out.println("The total count of consonant :  "+consonantCount);
    }
}
