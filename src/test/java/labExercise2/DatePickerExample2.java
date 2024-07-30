package labExercise2;

import java.awt.AWTException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DatePickerExample2 extends BaseTest {
//	public static WebDriver driver;  
//	public static String baseUrl = "https://webapps.tekstac.com/Registration/";
	
//public static String Date= "02-02-2024";
	
	

		 	  	  		    	    		     	 	
	
	
	@Test
	public void verifydateExample() throws AWTException, InterruptedException
	{
		// Navigate to the webpage
        driver.get("https://webapps.tekstac.com/Registration/");
//
        // Find the date input element
        WebElement dateInput = driver.findElement(By.id("dob"));

        // Click on the input to trigger the date picker
        dateInput.click();

//         Creating Actions instance
        Actions actions = new Actions(driver);

        String Date = "07-17-2024";
        
        // Splitting the desired date into day, month, and year
        String[] dateParts = Date.split("-");
//
        // Using Actions to select the date
        actions.moveToElement(dateInput)
                .click()
                .sendKeys(dateParts[0]) // Day
                .sendKeys(dateParts[1]) // Month
                .sendKeys(dateParts[2]) // Year
                .build()
                .perform();
	}
}
