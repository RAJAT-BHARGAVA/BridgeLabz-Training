import java.util.Scanner;

public class LibraryReminderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rohan's Library Fine Calculator");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i + ":");

            System.out.print("Enter Due Date (in days): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (in days): ");
            int returnDate = sc.nextInt();

            int fine = 0;

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                fine = lateDays * 5;
                System.out.println("Returned Late by " + lateDays + " days.");
            } else {
                System.out.println("Returned On Time. No Fine!");
            }

            System.out.println("Fine to Pay: Rs." + fine);
        }

        System.out.println("\nThank you! Keep reading..");
        sc.close();
    }
}
