package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(4000);
		
		/*driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> optionslists=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		for(int i=0;i<optionslists.size();i++) {
			String str=optionslists.get(i).getText();
			System.out.println(str);
			
			if(str.equals("choice 2")) {
				optionslists.get(i).click();
				
				break;
			}
}		}*/
		
	doSelectCoiceValue(driver,"choice 3");
		//doSelectCoiceValue(driver,"choice 6");
		//doSelectCoiceValue(driver,"All");
	

	
		
	}

	public static void doSelectCoiceValue(WebDriver driver,String...value)
	{
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> optionslists=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		if(!value[0].equalsIgnoreCase("All")) 
		{
		for(int i=0;i<optionslists.size();i++) 
		{
			String str=optionslists.get(i).getText();
			System.out.println(str);
			
			for(int k=0;k<value.length;k++) 
			{
			
			if(str.equals(value[k])) 
			{
				optionslists.get(i).click();
				
				break;
			}
		}
		}
		}
		else {try {
			for(int all=0;all<optionslists.size();all++)
			{
				optionslists.get(all).click();
			}
		}
		
			catch(Exception e) {
	}
	}
	
	}
	
	
}

	