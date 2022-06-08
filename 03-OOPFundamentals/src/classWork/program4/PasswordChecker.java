package classWork.program4;

public class PasswordChecker {
	String pass1;
	String pass2;
	
	public PasswordChecker() {
		
	}
	
	public PasswordChecker(String pass1, String pass2) {
		super();
		this.pass1 = pass1;
		this.pass2 = pass2;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	
	public boolean isEqual(String pass1,String pass2) {
		if(pass1.length()==pass2.length()) {
			
		}
		else
		{
			return false;
		}
		return false;

	}
}
