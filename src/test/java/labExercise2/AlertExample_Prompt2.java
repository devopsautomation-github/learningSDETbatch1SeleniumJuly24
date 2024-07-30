package labExercise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;

public class AlertExample_Prompt2 extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("file:///C:/Users/91995/Desktop/rajesh/testData/Test.html");
		
		//click on button
		//driver.findElement(By.xpath("//input[contains(@value,'Show')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Thread.sleep(3000);

		//Alert / iframe / windows  ------------------------------ driver.switchTo()
		
		
		//handle an Alert ------------ 
		
		//accept -----ok
		//dismiss ---- cancel
		//getText 
		//sendKeys

		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		String actualAlerttext = promptAlert.getText();						//Please enter your name:
		
		System.out.println("actualAlerttext: " + actualAlerttext);
		Assert.assertEquals("Please enter your name:", actualAlerttext);				//validation step
		
		
		
		
		Thread.sleep(3000);
		
		promptAlert.sendKeys("Welcome Lavanaya");                              // value entered  ----inputbox ------
				
		Thread.sleep(3000);
		
		
		//accept
		promptAlert.accept();
		
		//dismiss
//		driver.switchTo().alert().dismiss();
		
		
		
		System.out.println(driver.findElement(By.cssSelector("#demoPrompt")).getText());
		Assert.assertTrue(driver.findElement(By.cssSelector("#demoPrompt")).getText().contains("Welcome Lavanaya"));
		
		
	}
	
	
	
	
	
	
	

}
