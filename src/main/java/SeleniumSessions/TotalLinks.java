package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	
	//total no:of links
	//print the text of each link -avoid blank texts
	//print the href property of each link

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		
		System.out.println("Total no:of links: " +linkslist.size());
		
		for(int i=0;i<linkslist.size();i++)
		{
			String str=linkslist.get(i).getText();
			
			if(!str.isEmpty()) {
			
			System.out.println(i + "----->" +str.trim());
			
			String hrefdetails=linkslist.get(i).getAttribute("href");
			System.out.println(hrefdetails);
	                        	}
					
		}	
	 
	}

}
