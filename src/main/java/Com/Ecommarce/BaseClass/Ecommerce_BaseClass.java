package Com.Ecommarce.BaseClass;

import java.util.concurrent.TimeUnit;






import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Ecommarce.Utilities.Genericutils;
import Com.Ecommarce.Utilities.WaitUtils;
import Com.Ecommerce.Configuration.Readconfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce_BaseClass  {

	public static Logger logger;
	public static WebDriver driver ;
	public Genericutils utils;
	
	
	Readconfiguration readconfig = new Readconfiguration();
	
	public String BaseURL  = readconfig.getApllicationURL1();
	public String Username = readconfig.Username1();
	public String Password = readconfig. Password1();
	
	@SuppressWarnings("deprecation")
	@Parameters("Browser")
	@BeforeMethod
	public void inicialization(){
//		logger=Logger.getLogger("28_Oct_Automation_Framework");
		logger=Logger.getLogger("28_Oct_Automation_Framework");
		PropertyConfigurator.configure("C:\\Users\\Admin\\eclipse-workspace\\28_Oct_Automation_Framework\\src\\test\\resources\\Configuration\\Config.properties");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		logger.info("Open Browser");
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(WaitUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(WaitUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		driver.get(BaseURL);
		logger.info("Open the aplication");
		
	}
	
		
		
		@AfterMethod
		public void Teardown() throws InterruptedException {
		
			Thread.sleep(3000);
			
			driver.quit();
			
			logger.info("Close the  browser");
			
		}
		
}
		
		
		
		
		
		
		
		
		
//		