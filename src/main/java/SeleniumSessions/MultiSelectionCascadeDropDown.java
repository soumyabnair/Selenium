package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionCascadeDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(5000);
					
		driver.findElement(By.id("justAnInputBox1")).click();
		
		doMultiCascade(driver,"choice 6","choice 6 2 1","choice 7");
		
		}
	
		public static void doMultiCascade(WebDriver driver,String...value) {
		List<WebElement> optionlists=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
	
		for(int i=0;i<optionlists.size();i++) {
			String str=optionlists.get(i).getText();
			//System.out.println(str);
			
			for(int k=0;k<value.length;k++) {
				
				if(str.equals(value[k])) {
				optionlists.get(i).click();
				break;
			}
				}
		}

	}
}


