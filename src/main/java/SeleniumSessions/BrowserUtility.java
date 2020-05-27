package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	WebDriver driver;

	public  WebDriver Browser(String browsername)
	{
		  switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println(browsername  +  " is not found");
			break;
		}
		  
		  return driver;
	}

	public void LaunchUrl(String url ) {
		driver.get(url);
		
	}
	
	public void NavigateUrl(String url) {
		driver.navigate().to(url);
	}
	
	public String LaunchTitle() {
		return driver.getTitle();
		
		}
	public void CloseBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}