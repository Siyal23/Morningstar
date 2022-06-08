package oop02;

public class AccountApp {

	public static void main(String[] args) {
		//Account acc=new Account();=>cant declare object of account class because it is abstract
		Account acc=null;
		
		/*acc=saving;//at runtime this method will be called
		acc.showAccount();//this is happen at compile  time
		acc=current;
		acc.showAccount();*/
		
		if(Math.random()>0.5) {
			acc=new Saving(101101,"Siyal Patil",500000,4.5);
		}
		else {
			acc=new Current(10001,"Pranali",25000,50000);
		}
		acc.showAccount();
	}

}
