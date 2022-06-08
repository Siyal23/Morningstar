package thread3;


class WithdrawalTask implements Runnable{
	
	private Customer customer;
	
	WithdrawalTask(Customer customer){
		this.customer=customer;
	}
	@Override
	public void run() {
		customer.getAccount().withdraw(2500);
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class SingleThreadedBank {

	public static void main(String[] args) {
		Customer customer=new Customer("Siyal","Patil");
		Account account=new Account(1000);
		customer.setAccount(account);
		System.out.println(customer.getAccount());
		
		account.deposite(5000);
		
		System.out.println("Balnce after deposit"+account.getBalance());;
		
		WithdrawalTask task=new WithdrawalTask(customer);
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		Thread t3=new Thread(task);
		Thread t4=new Thread(task);
		Thread t5=new Thread(task);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
