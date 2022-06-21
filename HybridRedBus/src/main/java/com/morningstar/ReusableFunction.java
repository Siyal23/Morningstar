package com.morningstar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Library;

public class ReusableFunction extends Library{
	public ReusableFunction(WebDriver driver) {
		this.driver=driver;
	}
	public void mouseMove(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	public void quit() {
		driver.close();
	}
}
