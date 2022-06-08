package thread1;

public class Test2 extends Thread{

	@Override
	public void run() {
		System.out.println("Name of the thread:"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Test2 obj=new Test2();
		/*obj.run();
		 * we dont need to call run method,if we call start(),then 
		 * it will automatically call the run method and a new thread is 
		 * created
		 * */
		obj.start();
	}

}
