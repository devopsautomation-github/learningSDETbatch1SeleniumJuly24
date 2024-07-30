package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constants;

//import utility.Constants;

public class CrossBrowserTesting {
	
	public WebDriver driver;
	
	@Test
	public void verifyLoginTest() {
		
		
		String br = Constants.browser;
		System.out.println("execution on browser: " + br);
		//cross Browser testing
		
		
		if (br.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else {
			
			System.out.println("Execution on Default Browser CHROME");
			driver = new ChromeDriver();
		}
		
		
		//chrome Browser
//		WebDriver driver = new ChromeDriver();
		
		
		//Edge
//		WebDriver driver = new EdgeDriver();
		
		//Edge
		//WebDriver driver = new FirefoxDriver();
		
		
		
		
		
		
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
