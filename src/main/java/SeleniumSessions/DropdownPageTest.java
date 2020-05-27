package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPageTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		ElementUtility elementutil=new ElementUtility(driver);
		By dropdown=By.id("dropdown");
		elementutil.doSelectByVisibleText(dropdown,"Option 2");
		//elementutil.doSelectByIndex(dropdown, 1);
		//elementutil.doSelectByValue(dropdown, "Option 1");
		

	}

}
