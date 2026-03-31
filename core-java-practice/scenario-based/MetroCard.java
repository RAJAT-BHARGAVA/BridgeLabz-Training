import java.util.Scanner;
public class MetroCard {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       
        // variable to store the card balance
        int balance = 500;


        while (balance>0) {
            
            System.out.print("Please enter your distance in Km or Either If you want to exit please enter 0:");
            double distance = scanner.nextDouble();
            if(distance==0){
                System.out.println("thank You for using.. Visit Again. ");
                break;
            }
            if(distance<0){
                System.out.println("Invalid distance Entered");
                break;
            }
            int fare = (distance <= 5) ? 50 :
            (distance <= 10) ? 80 :
            (distance <= 20) ? 120 :
            (distance <= 30) ? 150 :
            (distance <= 50) ? 180 : 
            200;
            //check the avilable balance is sufficent or not 
            if(balance<fare){
                System.out.println("Insufficient balance in the card");
                break;
            }

            // update the new balance after the travel 
            balance-=fare ; 

            System.out.println("your fare for this Journey is "+ fare +"Rs.");
            System.out.println("you travelled for   "+distance+"Km");
            System.out.println("The remaining balance of card is :    "+balance+"Rs.");

        }

        scanner.close();
    }
}
