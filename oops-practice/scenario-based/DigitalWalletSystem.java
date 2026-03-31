import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// transfer interface
interface TransferService {
    void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException;
}

// wallet to wallet transfer
class WalletTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        if (from.balance < amount) {
            throw new InsufficientBalanceException("Insufficient wallet balance");
        }

        from.balance -= amount;
        to.balance += amount;

        from.transactions.add(new Transaction("Sent", amount));
        to.transactions.add(new Transaction("Received", amount));

        System.out.println("Wallet to wallet transfer successful");
    }
}

// bank to wallet transfer
class BankTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        // assume bank always has money
        to.balance += amount;
        to.transactions.add(new Transaction("Bank Credit", amount));

        System.out.println("Money added from bank");
    }
}

// user class
class User {
    int userId;
    String name;

    User(int id, String name) {
        userId = id;
        this.name = name;
    }
}

// wallet class
class Wallet {
    int walletId;
    User user;
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    Wallet(int id, User user) {
        walletId = id;
        this.user = user;
        balance = 0;
    }

    void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Added", amount));
        System.out.println("Money added");
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdrawn", amount));
        System.out.println("Money withdrawn");
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void showTransactions() {
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t.type + " - " + t.amount);
        }
    }
}

// transaction class
class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

// main system
public class DigitalWalletSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User u1 = new User(1, "Rajat");
        User u2 = new User(2, "Amit");

        Wallet w1 = new Wallet(101, u1);
        Wallet w2 = new Wallet(102, u2);

        TransferService walletTransfer = new WalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        int choice;

        do {
            System.out.println("\n1 Add Money (Bank)");
            System.out.println("2 Withdraw Money");
            System.out.println("3 Wallet Transfer");
            System.out.println("4 Check Balance");
            System.out.println("5 Transaction History");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    bankTransfer.transfer(null, w1, amt);
                }

                else if (choice == 2) {
                    System.out.print("Amount: ");
                    w1.withdraw(sc.nextDouble());
                }

                else if (choice == 3) {
                    System.out.print("Amount: ");
                    walletTransfer.transfer(w1, w2, sc.nextDouble());
                }

                else if (choice == 4) {
                    w1.showBalance();
                }

                else if (choice == 5) {
                    w1.showTransactions();
                }

            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
