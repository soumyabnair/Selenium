package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalimages {
	
	//print the src property of each image

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> imagelists=driver.findElements(By.tagName("img"));
		
		System.out.println(imagelists.size());
		
		for(int i=0;i<imagelists.size();i++) {
			
				
		System.out.println(imagelists.get(i).getAttribute("src"));
			
		}
		
		
		
		
	}

}
