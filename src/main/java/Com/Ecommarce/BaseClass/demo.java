package Com.Ecommarce.BaseClass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Com.Ecommerce.PageClasses.New_Registrations_PageClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

WebDriver driver ;
	
	public static void main (String [] args) {
		
		demo EB = new  demo();
		
		EB.logger1();
		
	}
	
	public  void logger1() {
		System.out.println("11_March_Automation_FrameWork");
	}
	
	}

//	public void inicialization() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(29,TimeUnit.SECONDS);
//		
//		driver.get("https://demo.nopcommerce.com/");
//		
//		New_Registrations_PageClass NR = new New_Registrations_PageClass(driver);
//		
//	
//	    NR.Registration();
//	    
//	    Thread.sleep(3000);
//	    NR.Gender_Male();
//	    
////	    Thread.sleep(3000);
//	    NR.Firstname("Test");
//	    
////	    Thread.sleep(3000);
//	    NR.Lastname("Java");
//	    
////	    Thread.sleep(3000);
//	    NR.Day1("3");
//	    
////	    Thread.sleep(3000);
//	    NR.Month1("6");
//
////	    Thread.sleep(3000);
//	    NR.Year1("2009");
//	    
////	    Thread.sleep(3000);
//	    NR.Email("Test8@gamil.com");
//	    
////	    Thread.sleep(3000);
//	    NR.CompanyName("Test");
//	    
////	    Thread.sleep(3000);
//	    NR.Password("Test@123");
//	    
////	    Thread.sleep(3000);
//	    NR.ConformPass("Test@123");
//	    
////	    Thread.sleep(3000);
//		NR.registerbutton();
//		
////		Thread.sleep(3000);
//		NR.loginsucces();
//		
//		
//	}
//	
//}
//	

