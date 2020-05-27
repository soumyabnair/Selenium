package TestNGSessions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Test(priority = 2)
	public void verifyLoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("login page titls is: " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	@Test(priority = 1)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}

	@Parameters({"username","password"})
	@Test(priority = 3)
	public void loginTest(String un,String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("loginBtn")).click();
	}

}
