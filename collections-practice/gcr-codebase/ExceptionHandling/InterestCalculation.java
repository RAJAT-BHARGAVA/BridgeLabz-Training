public class InterestCalculation {

    // Method that validates input and propagates exception
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            // throw is used to explicitly raise an exception
            throw new IllegalArgumentException("Invalid input");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double interest = calculateInterest(10000, 5, 2);
            System.out.println("Calculated Interest: " + interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
