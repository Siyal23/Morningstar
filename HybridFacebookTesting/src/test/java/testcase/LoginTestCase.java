package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.morningstar.ReusableFunction;

import pages.LoginPage;

public class LoginTestCase extends Library{
	@BeforeMethod
	public void launch() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void loginTest() {
		LoginPage pageObj=new LoginPage(driver);
		pageObj.login("siyal_patil@yahoo.com","123");
	}
	
	
	@AfterMethod
	public void closeApp() {
		ReusableFunction reuse = new ReusableFunction(driver);
		reuse.to_take_screenshot("src/test/resources/screenshots/login.png");
		reuse.quit();
	}
 
}
