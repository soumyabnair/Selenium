package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(By.id("Login"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele1).build().perform();
		
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"menu-list-login\"]/li[1]/a"));
		
		
		action.moveToElement(ele2).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu-list-login\"]/li[1]/ul/li[1]/a")).click();
		
	
		

	}

}
