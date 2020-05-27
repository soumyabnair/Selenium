package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownhandlewithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String date="13-Jun-2009";
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		By dayoptions=By.xpath("//select[@id=\"day\"]/option");
		By monthoptions=By.xpath("//select[@id=\"month\"]/option");
		By yearoptions=By.xpath("//select[@id=\"year\"]/option");
		
		ElementUtility ele=new ElementUtility(driver);
		
		
		ele.doSelectdropdownWithoutSelect(dayoptions, date.split("-")[0]);
		ele.doSelectdropdownWithoutSelect(monthoptions, date.split("-")[1]);
		ele.doSelectdropdownWithoutSelect(yearoptions, date.split("-")[2]);
		
		driver.quit();
		
		
	/*	List<WebElement> optionslists=driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		for(int i=0;i<optionslists.size();i++) 
		{
			String str=optionslists.get(i).getText();
			
			System.out.println(str);
			if(str.equals("15"))
			{
				optionslists.get(i).click();
				break;
			}
			
			
			
			
		}*/
		
		/*
		doSelectdropdownWithoutSelect(driver,"//select[@id=\"day\"]/option",date.split("-")[0]);
		doSelectdropdownWithoutSelect(driver,"//select[@id=\"month\"]/option",date.split("-")[1]);
		doSelectdropdownWithoutSelect(driver,"//select[@id=\"year\"]/option",date.split("-")[2]);*/

	}
	
/*	public static void doSelectdropdownWithoutSelect(WebDriver driver,String xpathvalue,String value)
	{
		List<WebElement> optionslists=driver.findElements(By.xpath(xpathvalue));
		for(int i=0;i<optionslists.size();i++) 
		{
			String str=optionslists.get(i).getText();
			
			System.out.println(str);
			if(str.equals(value))
			{
				optionslists.get(i).click();
				break;
			}
			
			
			
			
		}
		
	}*/
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


