package string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = new String("Morningstar");
		String str2 = "Morningstar";
		String str3 = "Morningstar";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		if(str1 == str2) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

		
		/*
		 *when we created str3 it saw that the same string is already present 
		 *in the heap so it pointed to that old memory location thus giving both are same output
		 * */
		if(str2 == str3) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
		System.out.println("-----------------------------------------------------");
		
		/*
		 * Compares based on data or string so this will give Both are same
		 * */
		if(str1.equals(str2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
		
		if(str2.equals(str3)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
	}

}
