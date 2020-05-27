package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentid=it.next();
		System.out.println("Parent Window id is:"+parentid);
		
		String childid4=it.next();
		System.out.println("Child4 Window id is:"+childid4);
		
		String childid2=it.next();
		System.out.println("Child4 Window id is:"+childid2);
		
		String childid3=it.next();
		System.out.println("Child4 Window id is:"+childid3);
		
		driver.switchTo().window(childid4);
		System.out.println("The tittle of popup4 is:"+driver.getTitle());
		System.out.println("The url of popup 4 is:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(childid2);
		System.out.println("The tittle of popup2 is:"+driver.getTitle());
		System.out.println("The url of popup 2 is:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(childid3);
		System.out.println("The tittle of popup3 is:"+driver.getTitle());
		System.out.println("The url of popup 3 is:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentid);
		System.out.println("The title of parent is:"+driver.getTitle());
		System.out.println("The url of parent is:"+driver.getCurrentUrl());
		
		driver.quit();
		
		
		

	}

}
