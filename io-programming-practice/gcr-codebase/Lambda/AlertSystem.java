import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

public class AlertSystem {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("EMERGENCY"),
            new Alert("INFO"),
            new Alert("REMINDER"),
            new Alert("EMERGENCY")
        );

        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}