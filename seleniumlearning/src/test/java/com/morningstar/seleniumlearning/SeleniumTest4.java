package com.morningstar.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest4 {
	WebDriver driver;
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	public void login() {
		driver.findElement(By.xpath("//*[contains(@id,'email' and @name='email')]")).sendKeys("siyal_patil@yahoo.com");
		driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	}
	public void close() {
		driver.close();
	}
	
	public static void main(String[] args) {
		SeleniumTest4 obj=new SeleniumTest4();
		obj.launchApp();
		obj.login();
		obj.close();
	}

}
