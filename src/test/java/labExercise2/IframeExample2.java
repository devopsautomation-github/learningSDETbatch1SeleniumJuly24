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

public class IframeExample2 extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		
		//iframe
		
		
		//switchto Frame
		//index --- start from 0
		//name or id
		//WebElement ------- 
		
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		
		
		
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe_heading");
		driver.switchTo().frame(myFrame);
		
		
		
		
		String headingtext = driver.findElement(By.cssSelector("[src*='tatras3']")).getAttribute("alt");					//Planning the ascent
		System.out.println("heading Text: " + headingtext);
		
		
	}
	
	
	
	
	
	
	

}
