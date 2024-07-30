package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

public class TestBase {
	
WebDriver driver;
LoginPage lp;
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close an application");
		
		driver.close();
		driver.quit();
	}
	
	
	@BeforeTest
	public void launcApp() throws Exception {
		
		System.out.println("launching an application");
		driver = new ChromeDriver();     //session 
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		
		//page Object
		lp = new LoginPage(driver);
		
		
		
	}

}
