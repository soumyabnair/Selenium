package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");

				
				
		WebElement element=driver.findElement(By.id("dropdown"));
		 doSelectByVisibleText(element,"Option 1");
		//doSelectByIndex(element,1);
		//doSelectByValue(element,"2");
		
	}
		
		public static void doSelectByVisibleText(WebElement ele,String value)
		{
			Select select=new Select(ele);
			select.selectByVisibleText(value);
		}
		
		public static void doSelectByIndex(WebElement ele,int i)
		{
			Select select=new Select(ele);
			select.selectByIndex(i);;
		}
		
		
		public static void doSelectByValue(WebElement ele,String value)
		{
			Select select=new Select(ele);
			select.selectByValue(value);
		}
		


}
