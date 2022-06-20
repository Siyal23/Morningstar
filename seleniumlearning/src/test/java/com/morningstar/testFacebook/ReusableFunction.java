package com.morningstar.testFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableFunction {
	
	WebDriver driver;
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
	}
	
	public void register() {
		driver.findElement(By.linkText("Create New Account")).click();
		
	}
	public void login() {
		driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("siyal_patil@yahoo.com");
		driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	}
	public void closeUp() {
		driver.close();
	}
}
