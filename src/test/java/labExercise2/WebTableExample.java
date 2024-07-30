package labExercise2;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebTableExample extends BaseTest {
	
	
	@Test
	public void verifyDragDropTestFeature() throws Exception {
		
		
		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_dept.html");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='sortingTable']"));
		
		List<WebElement> allHeader = driver.findElements(By.xpath("//table[@id='sortingTable']/thead/tr/th"));					//matches - 6

		
		System.out.println("header count: " + allHeader.size());
		
		
		
		
//		for (int i = 0; i < allHeader.size(); i++) {
//			
//			
//			String headertext =allHeader.get(i).getText();
//			
//			System.out.println("headertext are: " + headertext);
//			
//			
//			
//			
//			if(headertext.equalsIgnoreCase("Phone Number")) {
//				
//				System.out.println("found a match on index: " + i);
//			}
//			
//			
//		}
		
		//=============================================================================================//
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='sortingTable']/tbody/tr"));		
		
		System.out.println("Rows count: " + allRows.size());
		
		for (int i = 0; i < allRows.size(); i++) {
			
			
			String deptname = driver.findElement(By.xpath("//table[@id='sortingTable']/tbody/tr[      " +(i+1)+ "     ]/td[1]")).getText();
			System.out.println(deptname);
			
		}
		
		
		
	}

}
