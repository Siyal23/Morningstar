package com.morningstar.day2;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("Choose type of Account:");
		System.out.println("1.Savings Account \n 2.Current Account");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("Enter account number:");
			long account=sc.nextLong();
			System.out.println("Enter account holder name:");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter account balance:");
			float balance=sc.nextFloat();
			SavingsAccount svAccObj=new SavingsAccount(account,name,balance);
			System.out.println("Account Number:"+svAccObj.getAccountNumber());
			System.out.println("Holder Name:"+svAccObj.getHolderName());
			System.out.println("Balance:"+svAccObj.getBalance());
			break;
		case 2:

			System.out.println("Enter account number:");
			long currAccountNumber=sc.nextLong();
			System.out.println("Enter account holder name:");
			String currAccName=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter account balance:");
			float currAccBalance=sc.nextFloat();			
			CurrentAccount currAccObj=new CurrentAccount(currAccountNumber,currAccName,currAccBalance);
			System.out.println("Enter Amount to withdraw");
			float withdrawAmount=sc.nextFloat();
			currAccObj.overdraft(currAccBalance, withdrawAmount);
			break;
	}
		sc.close();
	}	
}


