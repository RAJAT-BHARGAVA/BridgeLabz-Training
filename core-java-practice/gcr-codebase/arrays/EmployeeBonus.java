import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = 10;

        // Arrays to store input data
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];

        // Arrays to store calculated data
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // INPUT LOOP 
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = scanner.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = scanner.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("❌ Invalid input! Salary must be positive and years cannot be negative.");
                i--; // decrement index to retry for same employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        
        for (int i = 0; i < size; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println("\n========== ZARA BONUS REPORT ==========");
        for (int i = 0; i < size; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " | Old Salary: ₹" + salary[i] +
                " | Bonus: ₹" + bonus[i] +
                " | New Salary: ₹" + newSalary[i]
            );
        }

        System.out.println("\n---------- COMPANY TOTAL ----------");
        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        System.out.println("Total Bonus Paid: ₹" + totalBonus);
        System.out.println("Total New Salary: ₹" + totalNewSalary);

        scanner.close();
    }
}
