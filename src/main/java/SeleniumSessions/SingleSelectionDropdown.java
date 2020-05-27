package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectionDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(4000);
		driver.findElement(By.id("justAnotherInputBox")).click();
		doSelectSingleselection(driver,"choice 2 3");
		
		
		
	}
		public static void doSelectSingleselection(WebDriver driver,String value) {				
		
		List<WebElement> choicelists=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		for(int i=0;i<choicelists.size();i++)
		{
			String str=choicelists.get(i).getText();
			System.out.println(str);
			if(str.equals(value))
			{
				choicelists.get(i).click();
				break;
			}
		}
		
}
	}


