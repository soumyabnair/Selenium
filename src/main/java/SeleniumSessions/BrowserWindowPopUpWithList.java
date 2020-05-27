package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Thread.sleep(3000);
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> handleslists=new ArrayList<String>(handles);
		
		System.out.println(handleslists.size());
		
		String parentid=handleslists.get(0);
		System.out.println("parentid:"+parentid);
		String child4id=handleslists.get(1);
		System.out.println("Child4id :"+child4id);
		
		driver.switchTo().window(child4id);
		System.out.println("Child4 title is:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();

		Set<String> handles=driver.getWindowHandles();
		
		List<String> handleslists=new ArrayList<String>(handles);
		System.out.println(handleslists.size());
		String child3id=handleslists.get(0);
		System.out.println("child3 id:"+child3id);
		
	}

}
