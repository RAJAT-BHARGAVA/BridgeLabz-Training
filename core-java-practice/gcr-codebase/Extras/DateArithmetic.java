import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Adding days, months, years
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Original Date : " + date);
        System.out.println("After +7 days, +1 month, +2 years : " + updatedDate);
        System.out.println("Final Date after -3 weeks : " + finalDate);
        scanner.close();
    }
}
