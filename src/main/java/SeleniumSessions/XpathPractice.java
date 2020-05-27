package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://freshworks.com");
		driver.findElement(By.xpath("(//a[@aria-label='categories menu'])[2]")).click();
		/*List<WebElement> elementslists=driver.findElements(By.xpath("//ul[@class='l-nav-list nav-main-menu']/li/a"));
		
		System.out.println(elementslists.size());
		
		for(int i=0;i<elementslists.size();i++) {
			String str=elementslists.get(i).getText();
			System.out.println(str);*/
	System.out.println();
		}
	}


