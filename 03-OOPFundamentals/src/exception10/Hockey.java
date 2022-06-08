package exception10;

public class Hockey {
	public static void main(String[] args) {
		try {
			System.out.println('A');
			throw new RuntimeException("Char not allowed!");
		} catch (Exception e) {
			System.out.println('B');
			/*exception is caused because of throw e 
			*/
			throw e;
		} finally {
			System.out.println('C');
		}
	}
}
