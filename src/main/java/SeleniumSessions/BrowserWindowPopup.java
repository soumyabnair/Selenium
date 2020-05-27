package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentwindowid=it.next();
		System.out.println("parent window id is:"+parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("Child window id is:"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println("The child window title is:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		System.out.println("The parent window title is:"+driver.getTitle());
		//driver.quit();

	}

}
