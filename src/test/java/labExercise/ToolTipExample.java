package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolTipExample extends BaseTest{
	
	
	@Test
	public void verifyNavigation() throws Exception {
		
		
		
		WebElement btnRegister = driver.findElement(By.cssSelector("[id='register']"));
		
		System.out.println(btnRegister.getAttribute("title")); //Registration
		
		
		Assert.assertEquals("Registration", btnRegister.getAttribute("title"));
		
	}
	
	

}
