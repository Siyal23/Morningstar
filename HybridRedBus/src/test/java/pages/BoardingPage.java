package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class BoardingPage extends Library{
	
	@FindBy(id="inpFilter")
	WebElement searchBoardingPoint;
	
	public BoardingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectBoardingPoint(String loc) {
		searchBoardingPoint.click();
	}
	
	
}
