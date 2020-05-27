package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitWebElements {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			
			/*WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));*/
			
			By username=By.id("username");
			By password=By.id("password");
			By Login=By.id("loginBtn");
			
		
			//driver.findElement(By.id("username")).sendKeys("soumyabnair@gmail.com");
	
			waitforElementPresent(driver, 10,username ).sendKeys("soumyabnair@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Test@123");
			
			waitforElementPresent(driver, 5, Login).click();
/*
			 wait=new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));*/
			//driver.findElement(By.id("loginBtn")).click();

	}

	
	public static WebElement waitforElementPresent(WebDriver driver,int timeout,By locator) 
	{
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}

}