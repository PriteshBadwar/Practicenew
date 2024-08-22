package Com.Ecommarce.Utilities;

import java.io.File;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Ecommarce.BaseClass.Ecommerce_BaseClass;
import net.bytebuddy.utility.RandomString;

public class Genericutils extends Ecommerce_BaseClass {
	
//	public static String GetScreenshotAs() throws IOException {
//		
//		
////		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
////		String TimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		
//		String Random = RandomString.make(6);		
//		
////		String Name = "Screnshot -- >" + Random+"_"+TimeStamp;
//		Path resourceDirectory = Paths.get("src", "test", "resources");
//
//		String AbsolutePath = resourceDirectory.toFile().getAbsolutePath();
//		
//		String Destination = AbsolutePath +"\\Screenshots\\"+Random+".png";
//
//		FileUtils.copyFile(Screen, new File(Destination));
//
//		return AbsolutePath;
		
	public static String getScreenshotAs() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		

		File source = ts.getScreenshotAs(OutputType.FILE);

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String Name = "- Screenshot -" + Timestamp;

	    Path resourceDirectory = Paths.get("src","test","resources");
	    
		String AbsolutePath = resourceDirectory.toFile().getAbsolutePath();

		String Destination = AbsolutePath + "\\Screenshots\\"+Name+".png";

		FileUtils.copyFile(source, new File(Destination));

		return Destination;
	}
		
		public static void Clickonelementusingjavascriptexecutor(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", element);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}


