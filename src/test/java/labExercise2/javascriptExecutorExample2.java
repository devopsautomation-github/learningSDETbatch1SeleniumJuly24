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

public class javascriptExecutorExample2 extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		
		Thread.sleep(4000);

		
//		driver.findElement(By.cssSelector("#submit")).click();
		
		WebElement ele = driver.findElement(By.cssSelector("[name=\"lname\"]"));
		
		//javascriptExecutor ----- execute the javascript
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
//		JS.executeScript("alert('hello everyone, happy learning!!')");
//		JS.executeScript("arguments[0].value='enter last name'", ele);
		
		JS.executeScript("arguments[0].value=arguments[1]", ele , "enter last name using JS");
		
		
	}
	
	
	
	
	
	
	

}
