import java.util.Scanner;

public class SpringSeason {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date :");
        int date = sc.nextInt();// input of dat e
        System.out.print("Enter the month :");
        int month = sc.nextInt();// input of // month 



        if(month==3){// compare months 
            if (date >= 20 && date <= 31) {//compare date
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } else if (month ==4 ) {// compare months
            if (date >= 1 && date <= 30) {//compare date 
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } else if (month==5) {// compare months
            if (date >= 1 && date <= 31) {//compare date
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } else if (month==6) {// compare months
            if (date >= 1 && date <= 20) {//compare date
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }

}
