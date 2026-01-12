class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName,
               String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head = null;
    private int count = 0;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        count++;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        TicketNode prev = null;

        do {
            if (temp.ticketId == id) {

                // If only one node
                if (temp == head && temp.next == head) {
                    head = null;
                }
                // If head node
                else if (temp == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Middle or last node
                else {
                    prev.next = temp.next;
                }

                count--;
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("Booked Tickets:");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name or movie name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) ||
                temp.movieName.equalsIgnoreCase(keyword)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for: " + keyword);
        }
    }

    // Count total tickets
    public int totalTickets() {
        return count;
    }

    private void displayTicket(TicketNode t) {
        System.out.println("Ticket ID: " + t.ticketId +
                ", Customer: " + t.customerName +
                ", Movie: " + t.movieName +
                ", Seat: " + t.seatNumber +
                ", Time: " + t.bookingTime);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Rajat", "Inception", "A10", "10:30 AM");
        system.addTicket(102, "Amit", "Avatar", "B12", "11:00 AM");
        system.addTicket(103, "Neha", "Inception", "C5", "11:15 AM");

        system.displayTickets();

        System.out.println("\nSearch Ticket:");
        system.searchTicket("Inception");

        System.out.println("\nRemove Ticket:");
        system.removeTicket(102);

        System.out.println("\nUpdated Tickets:");
        system.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + system.totalTickets());
    }
}
