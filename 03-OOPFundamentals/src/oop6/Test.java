package oop6;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();

// making t eligible for garbage collection
		t = null;
// calling garbage collector
		System.gc();
		System.out.println("end main");
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}
