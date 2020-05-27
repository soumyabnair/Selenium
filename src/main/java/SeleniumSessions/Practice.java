package SeleniumSessions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentid=it.next();
		System.out.println("Parent Window id is:"+parentid);
		
		
		String child4id=it.next();
		System.out.println("child4 Window id is:"+child4id);
		
						
		driver.switchTo().window(child4id);
		System.out.println("The title of popup4 is:"+driver.getTitle());
		System.out.println("The url of popup4 is:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentid);
		System.out.println("Parent url:"+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles1=driver.getWindowHandles();
		Iterator<String> it1=handles1.iterator();
		String child3id=it1.next();
		System.out.println("child3 Window id is:"+child3id);
		
		driver.switchTo().window(child3id);
		System.out.println("The title of popup3 is:"+driver.getTitle());
		System.out.println("The url of popup3 is:"+driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentid);
		Thread.sleep(2000);
				
        driver.findElement(By.linkText("Good PopUp #2")).click();
        Set<String>handles2=driver.getWindowHandles();
		Iterator<String>it2=handles2.iterator();
	    	String child2id=it2.next();
		System.out.println("child2 Window id is:"+child2id);
		driver.switchTo().window(child2id);
		System.out.println("The title of popup2 is:"+driver.getTitle());
		System.out.println("The url of popup2 is:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentid);
		System.out.println("The title of parent is:"+driver.getTitle());
		System.out.println("The url of parent is:"+driver.getCurrentUrl());
		
		driver.quit();

	}

}


	


