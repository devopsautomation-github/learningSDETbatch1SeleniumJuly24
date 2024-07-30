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

public class IframeExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("https://webapps.tekstac.com/PurchaseApp/");
		
		
		
		//iframe
		
		
		//switchto Frame
		//index --- start from 0
		//name or id
		//WebElement ------- 
		
		WebElement myFrame = driver.findElement(By.tagName("iframe"));
		
		
		
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe_heading");
		driver.switchTo().frame(myFrame);
		
		
		
		
		String headingtext = driver.findElement(By.cssSelector("h2.heading")).getText();
		System.out.println("heading Text: " + headingtext);
		
		
	}
	
	
	
	
	
	
	

}
