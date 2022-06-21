package com.morningstar.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTest_DataProvider {
	WebDriver driver;
	@BeforeMethod
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "Test Data")
	public void login(String username,String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		driver.close();
	}
	
	@DataProvider(name="Test Data")
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="siyal";
		data[1][1]="siyal123";
		data[2][0]="patil";
		data[2][1]="patil123";
		return data;
	}
}
