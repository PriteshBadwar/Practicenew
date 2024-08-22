package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;

public class Login_PageClass {

	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	public WebElement Logintab ;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	public WebElement Email ;
	
	@FindBy(xpath="//input[@id=\"Password\"]")
	public WebElement PassWord;
	
	@FindBy(xpath="//button[contains(text(),\"Log in\")]")
	public WebElement Loginbutton;
	
	
	public Login_PageClass(WebDriver driver) {
		
		driver = Ecommerce_BaseClass.driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void logintabM() {
		
		Logintab.click();
		
	}
	
	public void EmailM(String emailTD) {
		
		Email.sendKeys(emailTD);
		
	}
	
	public void PassWordM(String PassWordTD) {
		
		PassWord.sendKeys(PassWordTD);
		
	}
	
	public void LoginbuttonM() {
		
		Loginbutton.click();
		
	}
	
	
	
	
	
	
}
