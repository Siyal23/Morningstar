package exception2;

public class Test {
	
	public static void meth() throws NullPointerException{
		System.out.println("Start of method");
		boolean flag = true;
		if(flag)
			throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		Test.meth();
		System.out.println("End of program.");
	}
}

