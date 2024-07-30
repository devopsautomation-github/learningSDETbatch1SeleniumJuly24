package labExercise2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions_AmazonWishList extends BaseTest {
	
	
	@Test
	public void verifyDragDropTestFeature() {
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement ele_signIn = driver.findElement(By.xpath("//span[contains(text(),'Hello')]"));
		//ele.click();
		WebElement wishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		Actions act = new Actions(driver);
		
		
		//app1
		
//		act.moveToElement(ele_signIn).perform();
//		act.moveToElement(wishList).perform();
//		act.click().perform();
		
		
		//appp2
//		act.moveToElement(ele_signIn).moveToElement(wishList).click().perform();
		
		
		
		//appp2
		act.moveToElement(ele_signIn).click(wishList).perform();
		
		
	}

}
