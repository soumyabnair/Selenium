package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJSPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver(co);
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 driver.findElement(By.name("proceed")).click();
		 
		 Thread.sleep(5000);
		 
		 Alert myalert=driver.switchTo().alert();
		 
		System.out.println(myalert.getText()); 
		
		myalert.accept();
		
		
		
		
		
		
		
		
		

	}

}
