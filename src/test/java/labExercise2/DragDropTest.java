package labExercise2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest extends BaseTest {
	
	
	@Test
	public void verifyDragDropTestFeature() throws Exception {
		
		
		driver.get("http://webapps.tekstac.com/OnlineShopping/fashion.html");
		
		
		Actions act = new Actions(driver);
		
		
		WebElement ele_Shirts = driver.findElement(By.cssSelector("#Shirts"));
		WebElement basket = driver.findElement(By.cssSelector("div#droppable"));
		
//		ele_Shirts.getLocation().getX()
		
		Thread.sleep(4000);
		//dragdroptest
//		act.dragAndDrop(ele_Shirts, basket).perform();
		
		
		act.dragAndDrop(ele_Shirts, basket).build().perform();
		
	}

}
