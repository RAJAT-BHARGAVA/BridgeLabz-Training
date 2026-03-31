import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pushups = new int[7];   // store pushups for a week

        System.out.println("Enter push-ups done for 7 days (enter 0 for rest day):");

        for (int i = 0; i < pushups.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            pushups[i] = sc.nextInt();
        }

        int total = 0;
        int daysCounted = 0;

        for (int count : pushups) {
            if (count == 0) {
                continue;   // Skip rest day
            }

            total += count;
            daysCounted++;
        }

        double average = (daysCounted > 0) ? (double) total / daysCounted : 0;

        System.out.println("\n--- Fitness Report ---");
        System.out.println("Total Push-ups (excluding rest days): " + total);
        System.out.println("Active Workout Days: " + daysCounted);
        System.out.println("Average Push-ups per Active Day: " + average);
        sc.close();
    }
}
