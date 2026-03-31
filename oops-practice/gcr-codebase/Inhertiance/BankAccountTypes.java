package inheritance;

class BankAccount {
	String accountNumber;
	double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: $" + balance);
	}
}

class SavingsAccount extends BankAccount {
	private double interestRate;

	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void displayAccountType() {
		System.out.println("Account Type: Savings Account");
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}

class CheckingAccount extends BankAccount {
	private double withdrawalLimit;

	CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	public void displayAccountType() {
		System.out.println("Account Type: Checking Account");
		System.out.println("Withdrawal Limit: $" + withdrawalLimit);
	}
}

class FixedDepositAccount extends BankAccount {
	private int depositTerm;

	FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
		super(accountNumber, balance);
		this.depositTerm = depositTerm;
	}

	public void displayAccountType() {
		System.out.println("Account Type: Fixed Deposit Account");
		System.out.println("Deposit Term: " + depositTerm + " months");
	}
}

public class BankAccountTypes {
	public static void main(String[] args) {
		SavingsAccount account1 = new SavingsAccount("SA101", 5000, 4.5);
		CheckingAccount account2 = new CheckingAccount("CA202", 3000, 1000);
		FixedDepositAccount account3 = new FixedDepositAccount("FD303", 10000, 24);
		account1.displayAccountType();
		account1.displayDetails();
		System.out.println();
		account2.displayAccountType();
		account2.displayDetails();
		System.out.println();
		account3.displayAccountType();
		account3.displayDetails();
	}
}
