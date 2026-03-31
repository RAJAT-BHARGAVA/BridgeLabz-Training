import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String msg) {
        super(msg);
    }
}

// fare interface
interface FareCalculator {
    double calculateFare(double distance);
}

// normal pricing
class NormalFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

// peak pricing
class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}

// user class
class User {
    int userId;
    String name;

    User(int id, String name) {
        userId = id;
        this.name = name;
    }
}

// driver class
class Driver {
    int driverId;
    String name;
    boolean available = true;

    Driver(int id, String name) {
        driverId = id;
        this.name = name;
    }
}

// ride class
class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;

    Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    void showRide() {
        System.out.println("User: " + user.name +
                ", Driver: " + driver.name +
                ", Distance: " + distance +
                ", Fare: " + fare);
    }
}

// main system
public class CabBookingSystem {

    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Ride> rideHistory = new ArrayList<>();

    static Driver assignDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver available right now");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        drivers.add(new Driver(1, "Amit"));
        drivers.add(new Driver(2, "Rahul"));
        drivers.add(new Driver(3, "Sandeep"));

        User user = new User(101, "Rajat");

        int choice;

        do {
            System.out.println("\n1 Book Ride");
            System.out.println("2 View Ride History");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter distance (km): ");
                    double distance = sc.nextDouble();

                    System.out.println("1 Normal Fare");
                    System.out.println("2 Peak Fare");
                    int fareType = sc.nextInt();

                    FareCalculator calculator;
                    if (fareType == 2)
                        calculator = new PeakFare();
                    else
                        calculator = new NormalFare();

                    Driver driver = assignDriver();
                    double fare = calculator.calculateFare(distance);

                    Ride ride = new Ride(user, driver, distance, fare);
                    rideHistory.add(ride);

                    System.out.println("Ride booked successfully");
                    System.out.println("Driver assigned: " + driver.name);
                    System.out.println("Total Fare: " + fare);
                }

                else if (choice == 2) {
                    for (Ride r : rideHistory) {
                        r.showRide();
                    }
                }

            } catch (NoDriverAvailableException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
