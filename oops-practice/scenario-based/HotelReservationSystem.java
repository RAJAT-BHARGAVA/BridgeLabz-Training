import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class RoomNotAvailableException extends Exception {
    RoomNotAvailableException(String msg) {
        super(msg);
    }
}

// pricing interface
interface PricingStrategy {
    double calculatePrice(int days, double basePrice);
}

// normal season pricing
class NormalSeasonPricing implements PricingStrategy {
    public double calculatePrice(int days, double basePrice) {
        return days * basePrice;
    }
}

// peak season pricing
class PeakSeasonPricing implements PricingStrategy {
    public double calculatePrice(int days, double basePrice) {
        return days * basePrice * 1.5;
    }
}

// room base class
class Room {
    int roomNo;
    boolean available = true;
    double pricePerDay;

    Room(int roomNo, double pricePerDay) {
        this.roomNo = roomNo;
        this.pricePerDay = pricePerDay;
    }

    double getPrice() {
        return pricePerDay;
    }
}

// standard room
class StandardRoom extends Room {
    StandardRoom(int roomNo) {
        super(roomNo, 2000);
    }
}

// deluxe room
class DeluxeRoom extends Room {
    DeluxeRoom(int roomNo) {
        super(roomNo, 4000);
    }
}

// guest class
class Guest {
    int guestId;
    String name;

    Guest(int id, String name) {
        guestId = id;
        this.name = name;
    }
}

// reservation class
class Reservation {
    Room room;
    Guest guest;
    int days;
    double bill;

    Reservation(Room room, Guest guest, int days, double bill) {
        this.room = room;
        this.guest = guest;
        this.days = days;
        this.bill = bill;
    }

    void showInvoice() {
        System.out.println("Guest: " + guest.name);
        System.out.println("Room No: " + room.roomNo);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: Rs. " + bill);
    }
}

// main system
public class HotelReservationSystem {

    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Reservation> reservations = new ArrayList<>();

    static Room findAvailableRoom(Class<?> type) throws RoomNotAvailableException {
        for (Room r : rooms) {
            if (r.available && type.isInstance(r)) {
                return r;
            }
        }
        throw new RoomNotAvailableException("Room not available");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        rooms.add(new StandardRoom(101));
        rooms.add(new StandardRoom(102));
        rooms.add(new DeluxeRoom(201));

        Guest guest = new Guest(1, "Rajat");

        int choice;

        do {
            System.out.println("\n1 Book Room");
            System.out.println("2 Check Out");
            System.out.println("3 View Reservations");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.println("1 Standard  2 Deluxe");
                    int type = sc.nextInt();
                    System.out.print("Number of days: ");
                    int days = sc.nextInt();

                    Room room;
                    if (type == 1)
                        room = findAvailableRoom(StandardRoom.class);
                    else
                        room = findAvailableRoom(DeluxeRoom.class);

                    PricingStrategy pricing;
                    System.out.println("1 Normal Season  2 Peak Season");
                    int season = sc.nextInt();

                    if (season == 2)
                        pricing = new PeakSeasonPricing();
                    else
                        pricing = new NormalSeasonPricing();

                    double bill = pricing.calculatePrice(days, room.getPrice());

                    room.available = false;
                    Reservation r = new Reservation(room, guest, days, bill);
                    reservations.add(r);

                    System.out.println("Room booked successfully");
                    r.showInvoice();
                }

                else if (choice == 2) {
                    System.out.print("Enter room number: ");
                    int rno = sc.nextInt();

                    for (Reservation r : reservations) {
                        if (r.room.roomNo == rno) {
                            r.room.available = true;
                            System.out.println("Check-out successful");
                            r.showInvoice();
                        }
                    }
                }

                else if (choice == 3) {
                    for (Reservation r : reservations) {
                        r.showInvoice();
                    }
                }

            } catch (RoomNotAvailableException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
