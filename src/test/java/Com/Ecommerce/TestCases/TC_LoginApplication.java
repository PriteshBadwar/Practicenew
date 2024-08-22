package Com.Ecommerce.TestCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommarce.Utilities.Genericutils;
import Com.Ecommerce.PageClasses.Login_PageClass;

public class TC_LoginApplication extends Ecommerce_BaseClass{
	
	
	@Test
	public void login () throws IOException {
		
		Login_PageClass login = new Login_PageClass(driver);
		
		login.logintabM();
		Genericutils.getScreenshotAs();
		
		login.EmailM(Username);
		Genericutils.getScreenshotAs();
		
		login.PassWordM(Password);
		Genericutils.getScreenshotAs();
		
		login.LoginbuttonM();
		Genericutils.getScreenshotAs();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			
			logger.info("login test case pass");
			
//			Genericutils.getScreenshotAs();
		}
		
		
		
		else {
			Assert.assertTrue(false);
			
			logger.info("Login test case failed");
			
			Genericutils.getScreenshotAs();
		}
		
	}

}
