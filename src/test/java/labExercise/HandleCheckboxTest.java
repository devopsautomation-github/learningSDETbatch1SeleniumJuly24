package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckboxTest extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() {
		
		
		//
		WebElement chk_oldUser = driver.findElement(By.cssSelector("[id='oldUser']"));
		
		//click operation on inputbox/button/checkbox/radiobutton
		chk_oldUser.click();
		
		
		WebElement chk_newUser = driver.findElement(By.id("newUser"));
		
		//click operation on inputbox/button/checkbox/radiobutton
		chk_newUser.click();
		
		
		
		System.out.println("chekbox selected or not: " + chk_newUser.isSelected());
		
		
	}
	
	

}
