package exception5;

import java.util.regex.Pattern;

public class Test {
	//valid password,email,mobile,full name,pancard number
	public static void checkName(String name) throws InvalidNameException{
		boolean result=name.matches("[A-Z]\\s[a-z]+");
		/*this says first char should be capital and there can be multiple 
		lowercase chars so we use '+' symbol*/
		if(!result) {
			InvalidNameException e=new InvalidNameException("Invalid Name:"+name);
			throw e;
		}
	}
	public static void checkMobile(String mobile) throws InvalidMobileNumberException {
		boolean result=mobile.matches("[0-9]{10}");
		if(!result) {			
			InvalidMobileNumberException i=new InvalidMobileNumberException("Invalid Number:"+mobile);
			throw i;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		String name="Siyal Patil";
		String contactNo="7020646117";
		boolean whitespaceMatcher2 = Pattern.matches("\\s", " ");
		System.out.println("\\s -----------> " + whitespaceMatcher2);
		try{
			checkName(name);
			System.out.println("Valid Name:"+name);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}

		try {
			checkMobile(contactNo);
		}
		catch(InvalidMobileNumberException i) {
			System.out.println("Mobile number is invalid");
		}
	}
}
