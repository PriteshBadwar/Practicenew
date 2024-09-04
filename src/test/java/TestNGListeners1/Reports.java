package TestNGListeners1;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
	static ExtentReports extent;
	static public ExtentReports reports() {
		
		String path = System.getProperty("user.dir")+"\\reports\\"+"\\OrangeHRM.html\\";

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("OrangeHRM Test Report");
		
		 extent  = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Env", "QA");
		 extent.setSystemInfo("Execuated By", "Pritesh");
		extent.setSystemInfo("Execuated on", "Chrome");
		return extent;
	}
}
