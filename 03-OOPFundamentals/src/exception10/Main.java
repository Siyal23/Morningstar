package exception10;

class Test extends Exception {
}

class Main {
	static public void meth1() throws Test  {
		System.out.println("meth1 Called");
		throw new Test();
	}

	public static void main(String args[]) {
		try {
			Main.meth1();
		} catch (Test t) {
			System.out.println("Got the Test Exception");
		} finally {
			System.out.println("Inside finally block ");
		}
	}
}
