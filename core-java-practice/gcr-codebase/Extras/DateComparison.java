import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();

        // Convert input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        // Comparing Dates
        if(firstDate.isBefore(secondDate)) {
            System.out.println("First date is BEFORE the second date");
        }
        else if(firstDate.isAfter(secondDate)) {
            System.out.println("First date is AFTER the second date");
        }
        else if(firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the SAME");
        }

        scanner.close();
    }
}
