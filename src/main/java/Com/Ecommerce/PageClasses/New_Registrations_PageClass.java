package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;


import org.testng.Assert;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class New_Registrations_PageClass {
	
//	WebDriver driver;
	
	//CONSTRUCTOR
	
	
	public New_Registrations_PageClass (WebDriver driver) {
		
		driver=Ecommerce_BaseClass.driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
//	***********************************************************************************
//	WEBELEMENT VARIABLES OF WEBPAGE ELEMENTS
//	**********************************************************************************
	
	@FindBy(xpath = "//a[contains(text(),\"Register\")]")
	public WebElement Registration ;
	
	@FindBy(id = "gender-male")
	public WebElement Gender_Male;
	
	@FindBy(id="FirstName")
	public WebElement Firstname;
	
	@FindBy(id="LastName")
	public WebElement Lastname;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthDay\"]")
	public WebElement Day;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthMonth\"]")
	public WebElement Month;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthYear\"]")
	public WebElement Year;
	
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id=\"Company\"]")
	public WebElement CompanyName;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[contains(text(),\"Register\")]")
	public WebElement registerbutton;
	
	@FindBy(xpath="//div[contains(text(),\"Your registration completed\")]")
	public WebElement loginSucces;
	
//	*****************************************************************************************
//	TEST CASES
//	*****************************************************************************************
	public void Registration() {
		Registration.click();
	}
	
	public void Gender_Male() {
		this.Gender_Male.click();
	}
	
	public void Firstname(String FirstnameTD) {
		this.Firstname.sendKeys(FirstnameTD);
	}
	
	
	public void Lastname(String LastnameTD) {
		this.Lastname.sendKeys(LastnameTD);
	}
	
	public void Day1 (String dayTD) {
		
		Select s1 = new Select (Day);
		s1.selectByValue(dayTD);
	}
	
	
	public void Month1(String monthTD) {
		Select s2  = new Select (Month);
		s2.selectByValue(monthTD);
	}
	
	public void Year1(String yearTD) {
		Select s3 = new Select (Year);
		s3.selectByValue(yearTD);
	}
	
	
	public void Email(String emailTD) {
		this.Email.sendKeys(emailTD);
	}
	
	public void CompanyName(String copnamTD) {
		this.CompanyName.sendKeys(copnamTD);
	}
	
	public void Password(String passTD) {
		this.Password.sendKeys(passTD);
	}
	
	public void ConformPass(String conpassTD) {
		this.ConfirmPassword.sendKeys(conpassTD);
	}
	
	public void registerbutton() {
		this.registerbutton.click();
	}
	
	public void loginsucces()  {
		
		
		
		Boolean Text = loginSucces.isDisplayed();
		
		if(Text) {
			
			System.out.println("registration succesful");
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
}
