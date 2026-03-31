import java.util.Scanner;

// Custom checked exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            // IllegalArgumentException for negative amount
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            // Custom exception for insufficient balance
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Main class
public class BankTransactionSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create account with initial balance
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            // Call withdraw method
            account.withdraw(amount);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
