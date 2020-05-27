package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	public static void main(String[] args) throws InterruptedException {
		// 4 approaches of using id
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		Thread.sleep(5000);
		// Case 1
		// driver.findElement(By.id("username")).sendKeys("test123@gmail.com");
		// driver.findElement(By.id("password")).sendKeys("test123");
		// driver.findElement(By.id("loginBtn")).click();

		// Case 2
		// WebElement emailid=driver.findElement(By.id("username"));
		// WebElement password=driver.findElement(By.id("password"));
		// WebElement login=driver.findElement(By.id("loginBtn"));

		// emailid.sendKeys("test123@gmail.com");
		// password.sendKeys("test123");
		// login.click();

		// Case 3: By locators

		/*
		 * By email=By.id("username"); By password=By.id("password"); By
		 * loginButton=By.id("loginBtn");
		 * 
		 * 
		 * WebElement emailid=driver.findElement(email); WebElement
		 * pwd=driver.findElement(password); WebElement
		 * login=driver.findElement(loginButton);
		 * 
		 * emailid.sendKeys("test123@gmail.com"); pwd.sendKeys("test123");
		 * login.click();
		 */

		// Case 4: String

		String emailId = "username";
		String password = "password";
		String loginButton = "loginBtn";

		By email1 = By.id(emailId);
		By password1 = By.id(password);
		By loginButton1 = By.id(loginButton);

		driver.findElement(email1).sendKeys("test123@gmail.com");
		driver.findElement(password1).sendKeys("test123");
		driver.findElement(loginButton1).click();

	}

}
