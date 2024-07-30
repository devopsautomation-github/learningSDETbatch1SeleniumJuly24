package labExercise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class javascriptExecutorExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		Thread.sleep(4000);

		
//		driver.findElement(By.cssSelector("#submit")).click();
		
		WebElement eleSubmit = driver.findElement(By.cssSelector("#submit"));
		
		
		
//		eleSubmit.click();
//		eleSubmit.click({force});
		
		//javascriptExecutor ----- execute the javascript
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		JS.executeScript("arguments[0].click()", eleSubmit);
		
		
		
		
	}
	
	
	
	
	
	
	

}
