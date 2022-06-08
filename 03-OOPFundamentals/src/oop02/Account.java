package oop02;
public abstract class Account extends Object {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account() {
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public Account(int number, String holder, double balance) {
		accountNumber = number;
		accountHolder = holder;
		accountBalance = balance;
	}
	public void showAccount() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("Account Balance: "+accountBalance);
	}
}
