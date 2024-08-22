package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.Login_PageClass;
import Com.Ecommerce.PageClasses.TC_Ecommerce_AddtoCart;

public class TC_AddToCart extends Ecommerce_BaseClass {

	@Test
	public void AddProduct() throws InterruptedException {
		
		logger.info("Open application URL");
		Login_PageClass LT = new Login_PageClass(null);

		LT.logintabM();
		logger.info("Click on the login button");
		// logger.info("Click on the Login button");
		
		LT.EmailM("public@gmail.com");
		logger.info("Enter the user email");

		LT.PassWordM("Test@123");
		logger.info("Enter the user password");

		LT.LoginbuttonM();
		logger.info("Click on the user login button");
		
		TC_Ecommerce_AddtoCart TEA = new TC_Ecommerce_AddtoCart();
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(TEA.Com);
		
		WebElement Com = driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));
		
		act.moveToElement(Com).build().perform();
		
		TEA.NoteBook();
		
		Thread.sleep(3000);
		TEA.selectMackbook();
		
		Thread.sleep(3000);
		TEA.AdsToCart();
		
		Thread.sleep(3000);
		TEA.ProductAdded();
		
		TEA.Close();
		
	}
	
}
