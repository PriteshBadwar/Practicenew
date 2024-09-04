package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
static WebDriver driver;
	@FindBy(xpath = "//*[@class=\"oxd-userdropdown-tab\"]")
	WebElement dropDown;
	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logout;
	@FindBy(xpath = "//*[@class='oxd-icon bi-stopwatch']")
     WebElement stopwatch;
	
	
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dropDown() {
		dropDown.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
}
