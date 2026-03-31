import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int size = 3;

        // Arrays to store ages and heights
        int[] ages = new int[size];
        double[] heights = new double[size];

        // inputs
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter Age: ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        
        for (int i = 1; i < size; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        
        System.out.println("\n========== RESULT ==========");
        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}
