package locatorExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest2 {
	
	FirefoxDriver driver;
	
	@After
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close an application");
		driver.close();
	}
	
	
	@Before
	public void launcApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(5000);
		
		
		
	}
	
	@Test
	public void verifyTest() {
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
	}

}
