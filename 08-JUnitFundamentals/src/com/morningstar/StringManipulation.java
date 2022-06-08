package com.morningstar;


/*  1. The method doOperation should accept 3 arguments
	2. First & last argument should be string
	3. Second argument should be operator
	4. doOperation("Morningstar", "+", "India") => then it should return MorningstarIndia
	5. doOperation("HelloWorld", "-", "World") => then it should return Hello
	6. doOperation("Morningstar", "-", "India") => then it should return Morningstar
	7. doOperation("Morningstar", "*", "India") => then it should throw IllegalArgumentException
*/

//TDD-Test Driven Development
//RED-REFACTOR-GREEN i.e first all test cases will be failed
//then try to re-factor your code until i get green mark.
public class StringManipulation {
	public String doOperation(String company,String operator,String country) {
		String result=null;
		switch(operator) {
		case "+":
			result=company+country;
			break;
		
		case "-":
			result=company.replaceAll(country,"");
			break;
		default :
			throw new IllegalArgumentException(" Operation cannot be resolved.");
		}
		return result;
	}
}
