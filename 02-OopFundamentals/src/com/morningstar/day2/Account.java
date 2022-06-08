package com.morningstar.day2;

public class Account {
	long accountNumber;
	String holderName;
	float balance;
	
	public Account() {
		
	}
	
	public Account(long accountNumber, String holderName, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
		
}

class SavingsAccount extends Account{
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(long accountNumber, String holderName, float balance) {
		super(accountNumber, holderName, balance);
	}

	public void roi() {
		System.out.println("Calculation of return on intrest can be done here.");
	}
}

class CurrentAccount extends Account{
	
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, String holderName, float balance) {
		super(accountNumber, holderName, balance);
	}

	public void overdraft(float balance,float withdrawAmount) {
		if((balance-withdrawAmount)>0) {
			System.out.println(withdrawAmount+" Amount can be Withdrawn");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}
