package JavaStreams;

import java.util.*;

public class EmailNotification {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "rahul@gmail.com",
                "anujudaywal@gamil.com",
                "sneha@gamil.com",
                "vikram@gmail.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }
    public static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}

