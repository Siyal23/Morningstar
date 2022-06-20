package com.morningstar.seleniumlearning;

public class LoginTestCase {

	public static void main(String[] args) {
		ReusableFunction rObj=new ReusableFunction();
		rObj.launchApp();
		rObj.login();
		//rObj.closeup();
	}
}
