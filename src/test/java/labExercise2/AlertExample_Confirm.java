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

public class AlertExample_Confirm extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		//click on button
		//driver.findElement(By.xpath("//input[contains(@value,'Show')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(3000);

		//Alert / iframe / windows  ------------------------------ driver.switchTo()
		
		
		//handle an Alert ------------ 
		
		//accept -----ok
		//dismiss ---- cancel
		//getText 
		//sendKeys

		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		String actualAlerttext = confirmAlert.getText();						//Press 'OK' or 'Cancel' button!
		
		System.out.println("actualAlerttext: " + actualAlerttext);
		Assert.assertEquals("Press 'OK' or 'Cancel' button!", actualAlerttext);				//validation step
		
		
		
		//accept
		confirmAlert.accept();
		
		//dismiss
//		driver.switchTo().alert().dismiss();
		
		
		
		String Validationtext = driver.findElement(By.cssSelector("#demo")).getText();
		
		System.out.println("*****************: " +Validationtext);
//		Assert.assertEquals("You pressed Cancel!", Validationtext);
//		Assert.assertTrue(Validationtext.contains("Cancel"));
		Assert.assertTrue(Validationtext.contains("OK"));
		
		
		
	}
	
	
	
	
	
	
	

}
