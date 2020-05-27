package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.cfm?CFID=911534&CFTOKEN=71783635&jsessionid=48306ddf1ba19c21cf263ed1d42331f4613b");
		Thread.sleep(5000);
		int lists=driver.findElements(By.tagName("frame")).size();
		System.out.println(lists);
		
		

		

	}

}
