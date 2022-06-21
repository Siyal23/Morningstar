package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;

import pages.SearchPage;

public class SearchTestCase extends Library{
	@BeforeMethod
	public void launch() {
		launchApplication("chrome", "https://www.redbus.in/");
	}
	@Test
	public void search(){
		SearchPage search=new SearchPage(driver);
		search.search("Nagpur", "Mumbai");
		//search.searchDate();
	}
	/*
	 * @AfterMethod public void closeApp() { ReusableFunction reuse=new
	 * ReusableFunction(driver); //reuse.quit(); }
	 */
}
