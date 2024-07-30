package testNGExample1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	
	
	@Parameters("ibm_br")
	@BeforeTest
	public void launchApp(String brFromXML) {
		
		System.out.println("launching an application");
		System.out.println("fetch value from XML file: " + brFromXML);
		
		//chrome browser
		
		String br = brFromXML;
		
		if(br.equalsIgnoreCase("chrome")) {
			System.out.println("execution on chrome browser");
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("execution on edge browser");
			driver = new EdgeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
			
		}
		
		else {
			driver = new ChromeDriver();
			System.out.println("EXECUTION ON DEFAULT BROWSER");
		}
		
		
		
		//launching an application
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("closeApp an application");
		driver.close();
		driver.quit();
		
	}

}
