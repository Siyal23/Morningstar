package classWork.program4;

import java.util.Scanner;

public class CheckerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pass,rePass;
		System.out.println("Enter password");
		pass=sc.nextLine();
		System.out.println("Re-Enter Password");
		rePass=sc.nextLine();
		System.out.println(pass);
		
		PasswordChecker pw=new PasswordChecker();
		pw.isEqual(pass,rePass);
	}

}
