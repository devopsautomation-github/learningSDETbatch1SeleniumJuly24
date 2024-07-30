package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleDropDownTest extends BaseTest {
	
	
	
	@Test
	public void verifyHandleDropdown() {
		
		
		
		driver.findElement(By.cssSelector("[value=\"cbe\"]")).click();
		
		
		
	}

}
