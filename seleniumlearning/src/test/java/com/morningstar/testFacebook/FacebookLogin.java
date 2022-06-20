package com.morningstar.testFacebook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin extends ReusableFunction{

	@BeforeMethod
	public void launch() {
		launchApp();
	}
	
	@Test
	public void login() {
		super.login();
	}
	
	@AfterMethod
	public void closeApp() {
		closeApp();
	}

}
