package testNGExample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotatoinExample {
	
	WebDriver driver;
	//pre-condition  ----- before -----BeforeSuite ----->BeforeTest ---->BeforeClass ---->BeforeMethod
	//test  ----- Test
	//post-condition ----- after  -----AfterSuite  -----AfterTest ----AfterClass ----AfterMethod
	
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("........BeforeClass.........");
	}
	
	
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("........AfterClass.........");
	}
	
	
	

	@BeforeMethod
	public void BeforeMethod() {
		
//		driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
		
		System.out.println("........launch app before executing the test case.........");
	}
	
	
	
	@AfterMethod
	public void AfterMethod() {
		
//		driver.close();
		System.out.println("........close app after executing the test case.........");
	}
	
	
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("================AfterSuite===================");
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("***************BeforeTest***************");
	}
	
	
	
	
	
	
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("***************AfterTest***************");
	}
	
	
	@Test
	public void login() {
		
		System.out.println("login test execution started......");
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test execution started......");
		Assert.assertTrue(true);
	}

	
	@Test
	public void payment() {
		
		System.out.println("payment test execution started......");
		Assert.assertTrue(true);
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("================BeforeSuite===================");
		System.out.println("=======================: Start the server");
	}
}
