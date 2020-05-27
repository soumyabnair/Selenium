package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtility br=new BrowserUtility();
		WebDriver driver=br.Browser("chrome");
		br.LaunchUrl("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
        String str=br.LaunchTitle();
	   System.out.println("The title is :"+str);
	   
	  
	   ElementUtility element=new ElementUtility(driver);
	
	  By emailid= By.id("username");
	  By password=By.id("password");
	  By login=By.id("loginBtn");
	  By footer=By.className("copyright");
	  
	  element.getElement(emailid);
	  element.getElement(password);
	  element.getElement(login);
	  
	  element.doSendKeys(emailid, "soumyabnair@gmail.com");
	  element.doSendKeys(password, "test1234");
	  
	 	  if((element.doDisplay(login))) {
		  element.doClick(login);
	  }
	
	  System.out.println(element.doGettext(footer));
	    

	      
	   br.CloseBrowser();
	   
	   

	
	
	
	}

}
