package com.morningstar.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTestCase {
	WebDriver driver;
	
	@BeforeMethod
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();	
	}
	
	@Test
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();    
	}
}
