package labExercise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class TakeScreenshotExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("https://www.amazon.in/");
		
		
//		captureScreenshot("AmazonPage");
		
		//line of code 
		
		driver.findElement(By.cssSelector("[id*=\"textbox\"]")).sendKeys("iphone 15 pro");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		//takeScreenshot
		
		
		
		
		captureScreenshot("iphone_15_SearchItem");
		
		
		
	}
	
	
	
	
	
	
	public void captureScreenshot(String fileName) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./ibm_screenshot/"+fileName+".png");
		
		
		FileUtils.copyFile(screenshotFile, target);
	}

}
