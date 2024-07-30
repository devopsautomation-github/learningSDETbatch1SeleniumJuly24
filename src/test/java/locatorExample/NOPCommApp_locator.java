package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class NOPCommApp_locator extends BaseTest{
	
	@Test
	public void verifyLogin() throws Exception {
		
		//Identification
		//Locator ---- ID
		driver.findElement(By.id("Email")).clear();    //--------- unique match 
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		//class --- password
		driver.findElement(By.className("password")).clear();
		
		//name
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		//checkbox --- rememberMe
		driver.findElement(By.name("RememberMe")).click();
		
		//tagname ----login button
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		//validation Step
		System.out.println("application title after login: " + driver.getTitle());
		
		
		
		//linkText/partailLinkText ----- logout  ------ exact text 
		driver.findElement(By.linkText("Logout")).click();
		
		
		//linkText/partailLinkText ----- logout
//		driver.findElement(By.partialLinkText("ogou")).click();
//		driver.findElement(By.partialLinkText("go")).click();
		
		Thread.sleep(3000);
		//validation Step
		System.out.println("application title after logout: " + driver.getTitle());
		
		
		
		//XPATH
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
		
		//==========================================
		
		
		
		
	}
	

}
