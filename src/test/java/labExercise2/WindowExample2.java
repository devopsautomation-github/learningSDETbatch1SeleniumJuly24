package labExercise2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;

public class WindowExample2 extends BaseTest{
	
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		
		
		
		String parentWindow = driver.getWindowHandle();                     	//single window ---current focus
		System.out.println("Parent Window: " + parentWindow);
//		driver.getWindowHandles();												//all window ------ driver session
		
		
		
		//click on Signup button
		driver.findElement(By.partialLinkText("HOT")).click();
		
		
		
		
		
		Set<String> allWindow = driver.getWindowHandles();						//set --- unique values
		
		System.out.println("window count: " + allWindow.size());
		
		
		
		
		
		
		
		
		
		String win1 = (String)allWindow.toArray()[0];
		String win2 = (String)allWindow.toArray()[1];
		
		System.out.println("win1 Window: " + win1);
		System.out.println("win2 Window: " + win2);
		
		
		Thread.sleep(5000);
		//switch to window 2
		
		driver.switchTo().window(win2);
		
		System.out.println("Application title: " + driver.getTitle());       ///
		
		
		
		
		driver.findElement(By.cssSelector("[data-bs-target=\"#LoginModal\"]")).click();
		
		
		
		
		Thread.sleep(5000);
		
		//switch to window 2
		
		driver.switchTo().window(parentWindow);
		
		//click on Signup button
		driver.findElement(By.partialLinkText("CON")).click();
		
		
		
		Thread.sleep(5000);
		//switch to window 2
		
		driver.switchTo().window(win2);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	
	
	
	
	
	
	

}
