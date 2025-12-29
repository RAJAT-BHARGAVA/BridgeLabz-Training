import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueBooking = true;

        while (continueBooking) {

            System.out.println("\n Welcome to Movie Ticket Booking ");
            System.out.println("Choose Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Horror");
            System.out.print("Enter choice (1-3): ");
            int movieChoice = sc.nextInt();

            double ticketPrice = 0;

            switch (movieChoice) {
                case 1:
                    ticketPrice = 200;
                    System.out.println("You selected ACTION movie.");
                    break;
                case 2:
                    ticketPrice = 180;
                    System.out.println("You selected COMEDY movie.");
                    break;
                case 3:
                    ticketPrice = 220;
                    System.out.println("You selected HORROR movie.");
                    break;
                default:
                    System.out.println("Invalid movie choice! Try again.");
                    continue;   // restart loop
            }

            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("Gold")) {
                ticketPrice += 120;     // extra for premium seat
            } else if (seatType.equalsIgnoreCase("Silver")) {
                ticketPrice += 60;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 100;
            }

            System.out.println("\n------ Booking Summary ------");
            System.out.println("Movie Ticket Price: Rs." + ticketPrice);
            System.out.println("Enjoy your movie! ");

            System.out.print("\nBook for another customer? (yes/no): ");
            String more = sc.next();

            if (!more.equalsIgnoreCase("yes")) {
                continueBooking = false;
                System.out.println("Thank you for booking! ");
            }
        }
        sc.close();
    }
}
