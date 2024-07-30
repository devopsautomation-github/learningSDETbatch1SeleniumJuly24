package labExercise2;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	@After
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("close an application");
		
		driver.close();
		
		
		driver.quit();
	}
	
	
	@Before
	public void launcApp() throws Exception {
		
		System.out.println("launching an application");
		
		
		System.out.println(Constants.headless);
		
		
		
//		
//		//headless execution
//		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--headless");		
//		driver = new ChromeDriver(opt); 
		
		
		
		driver = new ChromeDriver();     //session 
//		driver.get("http://webapps.tekstac.com/InvoiceUpdates/");
		driver.get("https://webapps.tekstac.com/Registration/");
		
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		
	}

}
