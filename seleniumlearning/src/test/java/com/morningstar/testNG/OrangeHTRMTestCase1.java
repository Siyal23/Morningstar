package com.morningstar.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.morningstar.seleniumlearning.ReusableFunction;

public class OrangeHTRMTestCase1 extends ReusableFunction{
	
	
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
