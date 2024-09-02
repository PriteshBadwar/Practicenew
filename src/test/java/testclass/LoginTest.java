package testclass;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import PageClass.LoginPageClass;
import dev.failsafe.internal.util.Assert;

public class LoginTest extends BaseTest {
static LoginPageClass loginPage;
@Test(priority=1)
public void callingLoginCredentials() {
	
	loginPage.loginCredentials();
}
@Test(priority=2)
public void callingLoginButton() {
	loginPage.clickLoginButton();	
	
	}
@Test(priority=3)
public void validation() {
	String text = loginPage.assertions();
	System.out.println(text);
	org.testng.Assert.assertEquals(text,"OrangeHRM");

	
}


}
