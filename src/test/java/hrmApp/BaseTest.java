package hrmApp;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	@After
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close an application");
		driver.close();
	}
	
	
	@Before
	public void launcApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get(Constants.hrmApp);
		
		Thread.sleep(5000);
		
		
		
	}

}
