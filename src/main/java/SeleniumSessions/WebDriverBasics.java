package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
		driver.get("http://www.amazon.com");//enter URL
		String title=driver.getTitle();//get title
		System.out.println("Page title is:"+title);
		
		
		if(title.contains("Amazon")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		

	}
}
