package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageClass.LoginPageClass;

public class BaseTest {
static WebDriver driver;
static LoginPageClass loginPage;
@BeforeSuite
	public  void initBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		//options.addArguments("--Headless");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	@BeforeClass
	public void createObject() {
		
		 loginPage = new LoginPageClass(driver);
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		
	}
}
