package labExercise;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.Constants;

public class BaseTest2Headless {
	
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
		
		
		System.out.println(Constants.headless);
		
		
		if(Constants.headless) {
			
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");		
			driver = new ChromeDriver(opt); 
		}
		else {
			driver = new ChromeDriver();     //session 
		}
		
		//headless execution
		
		
		
		
		
		
//		driver.get("http://webapps.tekstac.com/InvoiceUpdates/");
		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/login.html");
		
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		
	}

}
