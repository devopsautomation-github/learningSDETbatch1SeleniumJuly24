package hrmApp;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyLoginHRM extends BaseTest{
	
	@Test
	public void verifyLogintest() throws Exception {
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-img']")).click();
		
		Thread.sleep(3000);
		
		
		
//		driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-link\"]")).click();		//multiple match ---4------ perform action on first match
		
		
		
		
//		//last match
//		String hrefvalue = driver.findElements(By.cssSelector("[class=\"oxd-userdropdown-link\"]")).get(3).getAttribute("href");
//		System.out.println(hrefvalue);
//		if(hrefvalue.contains("logout")) {
//			
//			driver.findElements(By.cssSelector("[class=\"oxd-userdropdown-link\"]")).get(3).click();
//		}
		
		
		List<WebElement> allElement = driver.findElements(By.cssSelector("[href=\"/web/index.php/auth/logout\"]"));
		
		
		
		int eleCount = allElement.size();
		System.out.println("Element count: " + eleCount);
		
		for (int i = 0; i < eleCount; i++) {
			
			
			String hrefvalue = allElement.get(i).getAttribute("href");
			System.out.println(hrefvalue);
			if(hrefvalue.contains("logout")) {
				
				allElement.get(i).click();
//			}
			
		}
		
		
		}
	}
		
	

}
