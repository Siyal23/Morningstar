package oop02;
public class Saving extends Account{
	private double roi;
	
	public Saving(int number, String holder, double balance, double roi) {
		super(number, holder, balance);
		this.roi = roi;
	}
	@Override
	public void showAccount() {
		System.out.println("Account Number:"+ getAccountNumber());
		System.out.println("Account Holder Name:"+ getAccountNumber());
		System.out.println("Account Balance:"+ getAccountNumber());
		
		System.out.println("ROI: "+roi);
	}
}
