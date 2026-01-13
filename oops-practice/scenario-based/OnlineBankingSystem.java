import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// interface
interface BankService {
    void deposit(double amt);
    void withdraw(double amt) throws InsufficientBalanceException;
    void checkBalance();
}

// parent class
class Account implements BankService {

    int accountNo;
    String name;
    double balance;
    ArrayList<String> history = new ArrayList<>();

    Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        history.add("Account opened with balance " + balance);
    }

    public void deposit(double amt) {
        balance = balance + amt;
        history.add("Deposited " + amt);
        System.out.println("Money deposited");
    }

    public void withdraw(double amt) throws InsufficientBalanceException {
        if (amt > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance = balance - amt;
        history.add("Withdrawn " + amt);
        System.out.println("Money withdrawn");
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }

    double calculateInterest() {
        return 0;
    }

    void showHistory() {
        for (String s : history) {
            System.out.println(s);
        }
    }
}

// savings account
class SavingsAccount extends Account {

    SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

// current account
class CurrentAccount extends Account {

    CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

// main class
public class OnlineBankingSystem {

    static void transfer(Account a1, Account a2, double amt)
            throws InsufficientBalanceException {

        a1.withdraw(amt);
        a2.deposit(amt);
        a1.history.add("Transferred " + amt + " to " + a2.accountNo);
        a2.history.add("Received " + amt + " from " + a1.accountNo);
        System.out.println("Transfer done");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc1 = new SavingsAccount(1, "Rajat", 5000);
        Account acc2 = new CurrentAccount(2, "Amit", 3000);

        int ch;

        do {
            System.out.println("\n1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Transfer");
            System.out.println("5 Transaction History");
            System.out.println("6 Interest");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            try {
                if (ch == 1) {
                    System.out.print("Amount: ");
                    acc1.deposit(sc.nextDouble());
                } else if (ch == 2) {
                    System.out.print("Amount: ");
                    acc1.withdraw(sc.nextDouble());
                } else if (ch == 3) {
                    acc1.checkBalance();
                } else if (ch == 4) {
                    System.out.print("Amount: ");
                    transfer(acc1, acc2, sc.nextDouble());
                } else if (ch == 5) {
                    acc1.showHistory();
                } else if (ch == 6) {
                    System.out.println("Interest = " + acc1.calculateInterest());
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

        } while (ch != 0);

        sc.close();
    }
}
