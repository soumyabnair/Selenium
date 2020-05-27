package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
	
		Thread.sleep(5000);
		
		//Case 1
		
		/*String header=driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);*/
							
		//Case2
	/*	WebElement link=driver.findElement(By.tagName("h1"));
		String header=link.getText();
		System.out.println(header);*/
		

		//Case 3
		
		/*By link=By.tagName("h1");
		String header=driver.findElement(link).getText();
		System.out.println(header);*/
	
		//case 4
		
		String text="h1";
		By text1=By.tagName(text);
		String header=driver.findElement(text1).getText();
		System.out.println(header);
		
	
		
	
		

	}

}
