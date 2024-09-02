package PageClass;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class LoginPageClass {
static 	WebDriver driver;
@FindBy(xpath = "//*[@name=\"username\"]")
WebElement userName;

@FindBy(xpath = "//*[@name=\"password\"]")
WebElement password;

@FindBy(xpath = "//*[text()=' Login ']")
WebElement loginButton;


public LoginPageClass (WebDriver driver) {
	
	this.driver =driver;
	PageFactory.initElements(driver,this);
}
public void loginCredentials() {
	
	userName.sendKeys("Admin");
	password.sendKeys("admin123");
}
public void clickLoginButton() {
	
	loginButton.click();
	}
public String assertions()
{
	String text = driver.getTitle();
	System.out.println(text);
	return text;
	
	
			
}

}
