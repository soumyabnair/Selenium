package TestNGSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSeleniumBeforeMethod {
	

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://app.hubspot.com/login");
	}
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		
		String title=driver.getTitle();
		System.out.println("Login page title is:"+title);
		AssertJUnit.assertEquals(title, "HubSpot Login");
		
	}
	
	@Test(priority=2)
    public void verifySignUpLinkTest() {
		/*Boolean b1=driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(b1);*/
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("soumyabnair@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		
	}
	
	@AfterMethod
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
