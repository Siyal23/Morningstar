package thread1;

public class Test3 implements Runnable{

	
	public static void main(String[] args) {
		Test3 task=new Test3();
		Thread t1=new Thread(task);//worker thread
		Thread t2=new Thread(task);//worker thread
		t1.start();
		t2.start();
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-- End of Main --");
	}

	@Override
	public void run() {
		System.out.println("Name of the thread:"+Thread.currentThread().getName());
	}

}
