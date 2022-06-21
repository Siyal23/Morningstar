package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;

import pages.BoardingPage;

public class BoardingTestCase extends Library{
	@BeforeMethod
	public void launch() {
		launchApplication("chrome", "https://www.redbus.in/");
	}
	@Test
	public void search(){
		BoardingPage board=new BoardingPage(driver);
		board.selectBoardingPoint("Wadi");
	}
}
