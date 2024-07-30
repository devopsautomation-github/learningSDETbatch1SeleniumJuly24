package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class navigationExample extends BaseTest{
	
	
	@Test
	public void verifyNavigation() throws Exception {
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");   
		
		Thread.sleep(3000);
		//back
		driver.navigate().back();
		
		
		System.out.println("application title: " + driver.getTitle());
		System.out.println("application url: " + driver.getCurrentUrl());
		
		System.out.println("==================================================");
		
		Thread.sleep(3000);
		//forward
		driver.navigate().forward();
		
		System.out.println("application title: " + driver.getTitle());
		System.out.println("application url: " + driver.getCurrentUrl());
		
		System.out.println("==================================================");
		
		
		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();
		
		System.out.println("application title: " + driver.getTitle());
		System.out.println("application url: " + driver.getCurrentUrl());
		
		System.out.println("==================================================");
		
		
		
	}
	
	

}
