import java.util.Scanner;

public class CoffeeCounter{
    public static void main(String[] args){
        
        // user input 
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please Enter your coffee type: \n Espresso -100rs \n Americano -110rs \n Latte -170rs \n Cold Coffee -200rs");
            String coffeeType= scanner.nextLine();


            if(coffeeType.equals("exit")){
                System.out.println("Thank you! Visit again..");
                break;
            }


            //take input for quantity 
            System.out.println("Enter the Quantity:");
            int quantity = scanner.nextInt();

            scanner.nextLine();

                switch (coffeeType.trim().toLowerCase()) {
                    case "espresso":
                        System.out.println("Your bill is: " + bill(quantity, 100)+" for "+ quantity +" Espresso");
                        break;
                    case "americano":
                        System.out.println("Your bill is: " + bill(quantity, 110)+" for "+ quantity +" Americano");
                        break;
                    case "latte":
                        System.out.println("Your bill is: " + bill(quantity, 170)+" for "+ quantity +" Latte");
                        break;
                    case "coldcoffee":
                        System.out.println("Your bill is: " + bill(quantity, 200)+" for "+ quantity +" Cold Coffee");
                        break;    
                    default:
                        System.out.println("Invalid coffee type. Try again.");
                }
    
        }
        scanner.close();
    }
    // function to calculate the bill along with gst 
    public static double bill(int quantity , int price){
        double gstAmount = (0.18*( quantity* price));
        double totalPrice = (price*quantity) + gstAmount;
        return totalPrice;
    }

}