package com.morningstar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

public class ReusableFunction extends Library{
	public ReusableFunction(WebDriver driver) {
		this.driver=driver;
	}
	
	public void to_take_screenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
	}
	
	public void dropdown(WebElement element,String selectedvalue) {
		Select select=new Select(element);
		select.selectByVisibleText(selectedvalue);
	}
	
	public void mouseMove(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public void quit() {
		driver.close();
	}
	
}

