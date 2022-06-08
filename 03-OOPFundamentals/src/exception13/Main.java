package exception13;


class Base extends Exception {
}

class Derived extends Base {
}

public class Main {
	public static void main(String args[]) {
		try {
			throw new Derived();
			
		} catch (Base b) {
			System.out.println("Base");
		} catch (Derived d) {
			System.out.println("Derived");
		}
	}
}
