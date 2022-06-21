package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class SearchPage extends Library{
	@FindBy(id="src")
	WebElement searchFrom;
	@FindBy(id="dest")
	WebElement searchTo;
	@FindBy(xpath="//*[@id='onward_cal']")
	WebElement searchDate;
	@FindBy(id = "search_btn")
	WebElement buttonClick;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//,String day,String month,String year
	public void search(String from,String to) {
		searchFrom.sendKeys(from);
		searchTo.sendKeys(to);
		//buttonClick.click();
	}
	public void searchDate() {
		searchDate.click();
		//day1.click();
	}
}
