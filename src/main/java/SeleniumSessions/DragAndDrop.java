package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(5000);
		
		By source=By.id("draggable");
		By target=By.id("droppable");
		
		ElementUtility ele=new ElementUtility(driver);
		 ele.doDragAndDrop(source, target);
		
		//WebElement source=driver.findElement(By.id("draggable"));
		//WebElement target=driver.findElement(By.id("droppable"));
		
		//Actions action=new Actions(driver);
		//action.dragAndDrop(source, target).build().perform();
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		

	}

}
