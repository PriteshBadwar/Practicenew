package Com.Ecommerce.TestCases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommarce.Utilities.Genericutils;
import Com.Ecommerce.PageClasses.New_Registrations_PageClass;
import net.bytebuddy.utility.RandomString;

public class TC_NewRegistration extends Ecommerce_BaseClass {
	
	
	

	@Test
	public void Registration() throws InterruptedException, IOException {
		
		New_Registrations_PageClass Regestration = new New_Registrations_PageClass(super.driver);
		
		
		logger.info("dlkfj;sldjf;l");
		Regestration.Registration();
	    
		Regestration.Gender_Male();
		Genericutils.getScreenshotAs();
		Regestration.Firstname("Test");

		Regestration.Lastname("Java");
		Genericutils.getScreenshotAs();
		Regestration.Day1("3");

		Regestration.Month1("6");
		Genericutils.getScreenshotAs();
		Regestration.Year1("2009");
	    
	    String name = RandomString.make(6);
		Genericutils.getScreenshotAs();
	    Regestration.Email("Test"+name+"@gamil.com");
	    
	    Regestration.CompanyName("Test");
		Genericutils.getScreenshotAs();
	    Regestration.Password("Test@123");
		Genericutils.getScreenshotAs();
	    Regestration.ConformPass("Test@123");
	    
	    Regestration.registerbutton();
		Genericutils.getScreenshotAs();
		Thread.sleep(6000);
		Regestration.loginsucces();
		Genericutils.getScreenshotAs();
		 
		logger.info("Registraion test case complitec");
		
	}
	
}
