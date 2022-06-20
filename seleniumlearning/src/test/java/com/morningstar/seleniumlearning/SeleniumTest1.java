package com.morningstar.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*
		 * 
		 *	For Facebook 
		 *
		 * driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.findElement(By.id("email")).sendKeys("siyalpatil69@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("123");
		 * driver.findElement(By.xpath("//*[@id=\"u_0_d_AT\"]")).click();
		 * //driver.quit();
		 */		
		/*
		 * 
		 *	https://opensource-demo.orangehrmlive.com/ 
		 * 
		 * 
		 *
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		 * //driver.findElement(By.linkText("Forgot your password?")).click();
		 * //driver.findElement(By.partialLinkText("Forgot")).click();
		 * driver.findElement(By.id("welcome")).findElement(By.linkText("Logout")).click
		 * ();
		 */
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
	}

}


















