package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		String date = "10-Jun-2000";

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		ElementUtility ele = new ElementUtility(driver);
		
		ele.doSelectDropdownValue(day,"31");
		ele.doSelectDropdownValue(month,"Mar");
		ele.doSelectDropdownValue(year,"1979");

		/*
		 * ele.doSelectByVisibleText(day, date.split("-")[0]);
		 * ele.doSelectByVisibleText(month, date.split("-")[1]);
		 * ele.doSelectByVisibleText(year, date.split("-")[2]);
		 */

		/*
		 * ArrayList<String> dayslist=ele.doGetDropdownOptions(day);
		 * System.out.println(dayslist); ArrayList<String>
		 * monthslist=ele.doGetDropdownOptions(month); System.out.println(monthslist);
		 * ArrayList<String> yearlist=ele.doGetDropdownOptions(year);
		 * System.out.println(yearlist);
		 */
		/*
		 * 
		 * 
		 * Select select=new Select(driver.findElement(day)); List<WebElement>
		 * dayslists=select.getOptions(); //System.out.println(optionslists.size());
		 * 
		 * for(int i=0;i<dayslists.size();i++) { String str=dayslists.get(i).getText();
		 * System.out.println(str); if(str.equals("15")) { dayslists.get(i).click();
		 * break; }
		 * 
		 * }
		 */
		
	}

/*	public static void doSelectDropdownValue(WebDriver driver,By locator,String value) 
	{

		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionslist = select.getOptions();
		// System.out.println(optionslists.size());
		for(int i=0;i<optionslist.size();i++)
		{
			String str=optionslist.get(i).getText();
			if(str.equals(value)) {
				optionslist.get(i).click();
				break;
			}
			
		}
	       
		 

	}*/

}
