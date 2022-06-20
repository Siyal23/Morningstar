package com.morningstar.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableFunction {
	WebDriver driver;
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
	}
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
		//driver.findElement(By.xpath("//*[@name='Submit' and @id='btnLogin']")).click();
		//driver.findElement(By.xpath("//*[@name='Submit' or @id='btnLogin']")).click();
		//driver.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	}  
	public void closeup() {
		driver.close();
	}
}
