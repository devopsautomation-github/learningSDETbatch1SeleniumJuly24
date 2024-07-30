package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleradioButton extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() {
		
		
		WebElement radioFemale = driver.findElement(By.cssSelector("[value=\"Female\"]"));
		
		
		
		System.out.println("is selected or not: " + radioFemale.isSelected());   //false
		
		
		
		Assert.assertFalse(radioFemale.isSelected());
		
		
		//clcik on Female radio button
		radioFemale.click();;
		
		System.out.println("is selected or not: " + radioFemale.isSelected());
		
		radioFemale.isSelected();
		
		Assert.assertTrue(radioFemale.isSelected());
		
		
	}
	
	

}
