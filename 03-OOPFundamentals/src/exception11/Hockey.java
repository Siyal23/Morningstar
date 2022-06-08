package exception11;

public class Hockey {
	
	public static void main(String[] args) {
		try {
			int score = 1;
			System.out.println(score++);
		} catch (Exception e) {
			System.out.println(score++);//out of scope
		} finally {
			System.out.println(score++);
		}
		System.out.println(score++);
	}
}
