package thread1;

public class Test {
	
	public void run() {
		System.out.println("Name of the thread:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		new Test().run();
	}
}
