package exception5;
/*
 * if i extend from Exception then it will be checked exception
 * if i extend from RuntimeException then it will be unchecked exception*/
public class InvalidNameException extends Exception{
	public InvalidNameException(String message) {
		super(message);
	}
}
