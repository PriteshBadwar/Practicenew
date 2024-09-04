package TestNGListeners1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.ScreenshotWithMethod;

public class ExtentListiners1 implements ITestListener {
	static WebDriver driver;
ExtentTest test ;
ExtentReports extent = Reports.reports();
	@Override
	public void onTestStart(ITestResult result) {
		String testStart = result.getName();
		System.out.println("Test Started"+testStart);
		test = extent.createTest(result.getName());
				}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testSuccess = result.getName();
		System.out.println("Test Sucess"+testSuccess);
		test.log(  Status.PASS, "Test Case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testFailure = result.getName();
		System.out.println("Test Failed"+testFailure);
		ScreenshotWithMethod ssm = new ScreenshotWithMethod();
		try {
		String path = ssm.captureScreenshot(driver, "Orange HRM");
		test.addScreencastFromPath(path);
		} catch (IOException e) {
			System.out.println("Exception Arrived While Taking Screenshot");
		}
		test.log(Status.FAIL, "Test case Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testSkipped = result.getName();
		System.out.println("Test Skipped"+testSkipped);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
    System.out.println("Test Tag Started");
}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Tag Finished");
		extent.flush();
	}

}
