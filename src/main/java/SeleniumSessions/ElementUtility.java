package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtility {

	
	WebDriver driver;
	
	
	public ElementUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> elementslists=driver.findElements(locator);
		return elementslists;
	}
	public WebElement getElement(By locator)
	{
		WebElement element=null;
		try {
		element=driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("Some exception got occured" +locator);
		}
		return element;
	}
	
	public void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) 
	{
		getElement(locator).click();
	}
	
	public String doGettext(By locator) 
	{
		return getElement(locator).getText();
	}
	
	public boolean doDisplay(By locator)
	{
		return getElement(locator).isDisplayed();
		
	}
		
		public  void doSelectByVisibleText(By locator,String value)
		{
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(value);
		}
		
		public  void doSelectByIndex(By locator,int i)
		{
			Select select=new Select(getElement(locator));
			select.selectByIndex(i);;
		}
		
		
		public  void doSelectByValue(By locator,String value)
		{
			Select select=new Select(getElement(locator));
			select.selectByValue(value);
		}
		
		
			public  ArrayList<String> doGetDropdownOptions(By locator)
		{
			
			 ArrayList<String> ar=new ArrayList<String>();
	        Select select=new Select(getElement(locator));
	        List<WebElement> optionslists=select.getOptions();
	       //System.out.println(optionslists.size());
	       
	       for(int i=0;i<optionslists.size();i++) 
	       {
	      	 String str=optionslists.get(i).getText();
	      	 ar.add(str);
	      	
	       }
			
			return ar;
		}
			
			public int doCountgetdropdownoptions(By locator) {
				return doGetDropdownOptions(locator).size();
				
			}

			public  void doSelectDropdownValue(By locator,String value) 
			{

				Select select = new Select(getElement(locator));
				List<WebElement> optionslist = select.getOptions();
				// System.out.println(optionslists.size());
				for(int i=0;i<optionslist.size();i++)
				{
					String str=optionslist.get(i).getText();
					if(str.equals(value)) {
						optionslist.get(i).click();
						break;
					}
					
				}
			       
				 

			}
			
			public  void doSelectdropdownWithoutSelect(By locator,String value)
			{
				List<WebElement> optionslists=getElements(locator);
				for(int i=0;i<optionslists.size();i++) 
				{
					String str=optionslists.get(i).getText();
					
					System.out.println(str);
					if(str.equals(value))
					{
						optionslists.get(i).click();
						break;
					}
					
					
					
					
				}
				
			}

//*****Actionc Class******//
			
	public void doDragAndDrop(By source,By target)
	{
		Actions action=new Actions(driver);
		WebElement sourceEle=getElement(source);
		WebElement targetEle=getElement(target);
		
		action.dragAndDrop(sourceEle, targetEle).build().perform();
	}

	public void doActionsSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
		
	}
	
	public void doActionsClick(By locator) {
		Actions action=new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}



//************* Wait  Utils********************//
	
	public  WebElement waitforElementPresent( By locator,int timeout) 
	{
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
	
	public  WebElement waitforElementToBeVisible( By locator,int timeout) 
	{
		WebElement element=getElement(locator);
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public  WebElement waitforElementToBeClickable( By locator,int timeout) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
	}
	
	public  Boolean waitforUrl( String url,int timeout) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(url));
		
	}
	
	public  void ClickWhenReady( By locator,int timeout) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		 element.click();
	}

  

}




		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	