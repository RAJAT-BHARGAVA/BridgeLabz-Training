package scenario_based;

class BankAccount {
	private final String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Amount cannot be nagative");
		}
	}

	public void withdrawal(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

}

public class BankAccountManager {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345678", 500.0);
		System.out.println(account.getBalance());
		System.out.println(account.getAccountNumber());
		account.deposit(150);
		account.withdrawal(400);
		System.out.println(account.getBalance());

	}
}
