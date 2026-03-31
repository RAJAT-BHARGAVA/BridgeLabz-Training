class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default Constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Maruti";
        rentalDays = 1;
        dailyRate = 2000;   // per day
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Daily Rate    : " + dailyRate);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {

        CarRental r1 = new CarRental();
        r1.displayDetails();

        CarRental r2 = new CarRental("Rajat", "BMW", 5, 5000);
        r2.displayDetails();
    }
}
