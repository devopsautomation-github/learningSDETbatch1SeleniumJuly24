package labExercise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;

public class AlertExample_Simple extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		//click on button
		//driver.findElement(By.xpath("//input[contains(@value,'Show')]")).click();
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		Thread.sleep(3000);

		//Alert / iframe / windows  ------------------------------ driver.switchTo()
		
		
		//handle an Alert ------------ 
		
		//accept -----ok
		//dismiss ---- cancel
		//getText 
		//sendKeys

		
		String actualAlerttext = driver.switchTo().alert().getText();						//Hi.. This is alert message!
		
		System.out.println("actualAlerttext: " + actualAlerttext);
		Assert.assertEquals("Hi.. This is alert message!", actualAlerttext);				//validation step
		
		
		
		//accept
//		driver.switchTo().alert().accept();
		
		//dismiss
		driver.switchTo().alert().dismiss();
		
	}
	
	
	
	
	
	
	

}
