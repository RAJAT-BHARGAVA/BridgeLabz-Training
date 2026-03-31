package JavaStreams;

import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList(
                "Rahul",
                "Anita",
                "Sneha",
                "Vikram",
                "Priya"
        );
        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

