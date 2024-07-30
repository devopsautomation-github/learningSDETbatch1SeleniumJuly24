package testNGExample1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPComm extends BaseTest{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {

		
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		//verification
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		System.out.println("application titile after login: " + driver.getTitle());
	}
	
	
	
	@Test
	public void verifyLogoutFeature() throws Exception {
		driver.findElement(By.partialLinkText("Logo")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Login"));
		System.out.println("application titile after logout: " + driver.getTitle());
		
		
	}

}
