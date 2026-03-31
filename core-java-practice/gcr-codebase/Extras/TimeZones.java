import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // Current time according to system
        ZonedDateTime localTime = ZonedDateTime.now();
        
        // GMT Time
        ZonedDateTime gmtTime = localTime.withZoneSameInstant(ZoneId.of("GMT"));

        // IST Time (Asia/Kolkata)
        ZonedDateTime istTime = localTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

        // PST Time (America/Los_Angeles)
        ZonedDateTime pstTime = localTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Local Time : " + localTime.format(format));
        System.out.println("GMT Time           : " + gmtTime.format(format));
        System.out.println("IST Time           : " + istTime.format(format));
        System.out.println("PST Time           : " + pstTime.format(format));
    }
}
