package exception9;

class Main {
	public static void main(String args[]) {
		try {
			throw 404; //throw new Exception
		} catch (int e) {//Exception e
			System.out.println("int exception " + e);
		}
	}
}
