public class DigitalWatchSimulation {
    public static void main(String[] args) {

        System.out.println("Digital Watch Simulation (24-hour)");

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                // Print time in HH:MM format
                System.out.printf("%02d:%02d\n", hour, minute);

                // Stop simulation at 13:00 (power cut)
                if (hour == 13 && minute == 0) {
                    System.out.println(" Power cut! Watch stopped at 13:00.");
                    break;   // exit minute loop
                }
            }
            // Check if hour == 13 to exit outer loop
            if (hour == 13) {
                break;
            }
        }

        System.out.println("Simulation ended.");
    }
}
