import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // Get today's date
        LocalDate today = LocalDate.now();

        // Define different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display dates in required formats 
        System.out.println("Current Date in dd/MM/yyyy format  : " + today.format(format1));
        System.out.println("Current Date in yyyy-MM-dd format  : " + today.format(format2));
        System.out.println("Current Date in EEE, MMM dd, yyyy  : " + today.format(format3));
    }
}
