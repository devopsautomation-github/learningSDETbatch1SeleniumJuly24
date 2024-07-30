package labExercise2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AbsoluteXPATHExample extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() {
		
		driver.get("http://webapps.tekstac.com/SeleniumApp1/EventManagement/index.html");
		//
		WebElement ele = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/nav/a/img"));
		
			
		
		System.out.println("attribute value are: " + ele.getAttribute("src"));
		System.out.println("attribute value are: " + ele.getAttribute("alt"));
		
	}
	
	

}
