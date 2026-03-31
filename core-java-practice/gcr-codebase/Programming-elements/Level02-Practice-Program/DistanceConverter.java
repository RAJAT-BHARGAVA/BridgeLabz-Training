import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / 5280;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        scanner.close();
    }
}
