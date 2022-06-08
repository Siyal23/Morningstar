package thread3;
public class Account {
	// sharable data
	private double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("After deposite current balance is: " + balance);
	}

	public synchronized void withdraw(double amount) {
		
			
			if ((balance - amount) >= 0) {
				
				balance = balance - amount;
				System.out.println("After withrawal current balance is: " + balance);
			} else {
				System.out.println("Insufficient balance");
			}
		
	}
}
