package labExercise;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleDropDownExample extends BaseTest{
	
	

	
	
	
	@Test
	public void verifyOptions() {
		
		
//		List<WebElement> del_area = driver.findElements(By.xpath("//select[@id='delivery_area']/option"));
		List<WebElement> del_area = driver.findElements(By.xpath("//select[@id='special_item']/option"));
		
		System.out.println("Count deliver values are: " + del_area.size());
		
		
		
		for (int i = 0; i < del_area.size(); i++) {
			
			
			System.out.println("value are : " + del_area.get(i).getText());
			
		}
		
		
		
		
	}

}
