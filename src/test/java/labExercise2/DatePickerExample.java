package labExercise2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constants;

public class DatePickerExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		
		String date = "07-17-2024";
		
		
		driver.get("https://webapps.tekstac.com/Registration/");
		
		
//		driver.findElement(By.cssSelector("#dob")).sendKeys("07/17/2024");
		
		
		
		driver.findElement(By.cssSelector("#dob")).sendKeys("07-17-2024");
		
		
		
	}
	
	
	
	
	
	

}
