package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClass.SignupPage;

public class DropdownTest extends BaseTest {
	static WebDriver driver;
	SignupPage signupPage = new SignupPage(driver);
	@Test(priority=3)
	public void callingDropDown()
	{
		signupPage.dropDown();
	}
	@Test(priority = 4)
	public void callingLogout()
	{
		signupPage.logout();
	}
	
	
	
	
}
