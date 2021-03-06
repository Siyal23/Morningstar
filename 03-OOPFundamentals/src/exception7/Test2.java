package exception7;


public class Test2 {
	public static void meth1() {
		try {
			String str = "Makarand";
			//char ch = str.charAt(0); // No Exception
			char ch = str.charAt(8); // StringIndexOutOfBoundsException 
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException occured.");
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException occured.");
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception occured.");
		}
		finally {
			System.out.println("Always executed.");
		}
	}
	public static void main(String[] args) {
		Test2.meth1();
	}
}
