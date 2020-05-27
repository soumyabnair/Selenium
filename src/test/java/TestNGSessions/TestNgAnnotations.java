package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("Connect with DB");
	}
	@BeforeTest
	public void createUSer() {
		System.out.println("Create user");
	}
	
	@BeforeClass
	public void launchbrowser() {
		System.out.println("launch the browser");
	}
	
	@BeforeMethod
	public void logintoApp() {
		System.out.println("Login to the application");
	}
	
	@Test
	public void verifyTitleTest() {
		System.out.println("Verify the title");
	}
	
	@Test
	public void verifyloggedinTest() {
		System.out.println("Verify logged in");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("Delete the user");
	}
	
	@AfterSuite
	public void DisconnectwithDB() {
		System.out.println("Disconnect with DB");
	}
	

}
