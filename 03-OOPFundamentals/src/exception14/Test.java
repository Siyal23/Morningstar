package exception14;

class Test {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 100 / a;
			System.out.println("b = " + b);
		} 
		finally {
		}
			System.out.println("inside the finally block");
		}
		System.out.println("End of App");
	}

