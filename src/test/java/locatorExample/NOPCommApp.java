package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPCommApp {
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		//launch a chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(4000);
		
		
		
		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		
		//validation 
		System.out.println("value attribute: "+ txtEmail.getAttribute("value"));
		System.out.println("type attribute: "+ txtEmail.getAttribute("type"));
		System.out.println("name attribute: "+ txtEmail.getAttribute("name"));
		
		
		boolean isEmailDisplayed = txtEmail.isDisplayed();
		
		System.out.println("isEmailDisplayed : " + isEmailDisplayed);
		
		
		txtEmail.clear();
		Thread.sleep(2000);
		txtEmail.sendKeys("lavanya@learnQuest.com");
		
		
		//locator  ----id
		
		driver.findElement(By.id("RememberMe")).click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		//close the browser
		driver.close();
		driver.quit();
		
		
	}
	

}
