package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		List<WebElement> lists=driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn"));
		Thread.sleep(2000);
		
		System.out.println(lists.size());
		
		driver.close();
		

	}

}


form-control private-form__control login-email
form-control private-form__control login-password m-bottom-3
uiButton private-button private-button--primary private-button--default m-bottom-4 login-submit private-button--non-link