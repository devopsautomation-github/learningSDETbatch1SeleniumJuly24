package labExercise2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constants;

public class WaitExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		
		
		
		
		//conditional wait
		
//		WebDriverWait wait = new WebDriverWait(driver, 3);

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.conditonalWait));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		HelpWait(By.cssSelector("#text3"), Constants.conditonalWait);

		
		driver.findElement(By.cssSelector("#text3")).sendKeys("enter name......");
		
		
		
	}
	
	
	
	public void HelpWait(By locatorElement, int waitTime) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorElement));
		
		
	}
	
	
	
	
	
	
	

}
