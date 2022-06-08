package exception3;

import java.io.IOException;

public class Test {
	
	public static void meth() throws IOException{
		System.out.println("Start of method");
		boolean flag = true;
		if(flag)
			throw new IOException();
	}
	
	public static void main(String[] args) {
		try {
			Test.meth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of program.");
	}
}

