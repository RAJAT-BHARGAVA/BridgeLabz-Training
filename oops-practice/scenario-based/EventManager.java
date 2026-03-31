import java.util.Scanner;

// ticket class
class Ticket {
    int price;

    Ticket(int price) {
        this.price = price;
    }
}

// main class
public class EventManager {

    static Ticket[] tickets = new Ticket[100];
    static int count = 0;

    // quick sort function
    static void quickSort(int low, int high) {
        if (low < high) {
            int p = partition(low, high);
            quickSort(low, p - 1);
            quickSort(p + 1, high);
        }
    }

    // partition logic
    static int partition(int low, int high) {
        int pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    static void showTickets(int limit, boolean cheapest) {
        if (count == 0) {
            System.out.println("No tickets available");
            return;
        }

        quickSort(0, count - 1);

        System.out.println(cheapest ? "Cheapest Tickets:" : "Most Expensive Tickets:");

        if (cheapest) {
            for (int i = 0; i < limit && i < count; i++) {
                System.out.println(tickets[i].price);
            }
        } else {
            for (int i = count - 1; i >= count - limit && i >= 0; i--) {
                System.out.println(tickets[i].price);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1 Add Ticket Price");
            System.out.println("2 Show Cheapest Tickets");
            System.out.println("3 Show Most Expensive Tickets");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ticket price: ");
                int price = sc.nextInt();
                tickets[count++] = new Ticket(price);
            }

            else if (choice == 2) {
                showTickets(50, true);
            }

            else if (choice == 3) {
                showTickets(50, false);
            }

        } while (choice != 0);

        sc.close();
    }
}
