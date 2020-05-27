package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		ElementUtility elementutil=new ElementUtility(driver);
		
		driver.get("https://app.hubspot.com/login");
		
		if(elementutil.waitforUrl("app", 8)) {
			System.out.println("hubspot is present in the url");
		}
		
		By username=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		
		
		elementutil.waitforElementPresent(username, 10).sendKeys("soumyabnair@gmail.com");
		elementutil.doActionsSendKeys(password,"Test1234" );
		elementutil.waitforElementToBeClickable(login, 5).click();
	
	}

}
