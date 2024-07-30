package javascriptExecutorExample;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptExecutorExample3 extends BaseTest{
	//public static WebDriver driver;
	public static Object jsweight,jsmode;
//    public String baseUrl = "http://webapps.tekstac.com/Cargo_Shipping_Cost/";
	
	@Test
	public void verifyCheckbox() throws Exception {
		
		driver.get("http://webapps.tekstac.com/Cargo_Shipping_Cost/");
		
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		
	  	jsweight = jse.executeScript("return document.getElementById('weight')");
	  	
	  	
	  	
	  	
	  	
	  	((WebElement)jsweight).sendKeys("300");
	  	
			
		jsmode = jse.executeScript("return document.getElementById('road')");
		((WebElement)jsmode).click();
			      
		
	    Object e2 = jse.executeScript("return document.getElementById('calculate')");
	    
	    
	    
	    
	    jse.executeScript("arguments[0].click();",(WebElement)e2 );
	
	
	
	}
	
	
	
	
	
	
	

}
