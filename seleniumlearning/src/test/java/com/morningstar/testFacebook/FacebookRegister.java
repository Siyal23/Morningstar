package com.morningstar.testFacebook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookRegister extends ReusableFunction{
	@BeforeMethod
	public void launch() {
		launchApp();
	}
	
	@Test
	public void register() {
		super.register();
	}
	
	@AfterMethod
	public void closeApp() {
		closeApp();
	}
}
