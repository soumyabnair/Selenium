package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		
		
		String browser="firefox";
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumy\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://www.google.com");
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\soumy\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://www.google.com");
		}

	}

}
