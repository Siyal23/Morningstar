package string;

public class StringDemo3 {
	public static void main(String[] args) {
		String str1 = new String("Morningstar");
			
		System.out.println(str1);
		str1 = str1 + " Mumbai";
		
		//print string from 0th position to 8th
		str1 = str1.substring(0, 8);
		System.out.println(str1);
		
	}
}
