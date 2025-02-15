package seleniumIDEExample;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginLogoutTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void loginLogoutTest() throws Exception {
	
	Thread.sleep(3000);
	
 driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
 Thread.sleep(3000);
 driver.findElement(By.id("RememberMe")).click();
 Thread.sleep(3000);
 driver.findElement(By.id("RememberMe")).click();
 
 
 //validation of Application title
 System.out.println("Application title before login: " + driver.getTitle());
 Assert.assertEquals("Your store. Login", driver.getTitle());
 
 
// assertThat(driver.getTitle(), is("Your store. Login"));
 {
   List<WebElement> elements = driver.findElements(By.cssSelector(".button-1"));
   assert(elements.size() > 0);
 }
 driver.findElement(By.cssSelector(".button-1")).click();
 Thread.sleep(3000);
 
 
 System.out.println("Application title after login: " + driver.getTitle());
 Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
 
 
// assertThat(driver.getTitle(), is("Dashboard / nopCommerce administration"));
 {
   List<WebElement> elements = driver.findElements(By.linkText("Logout"));
   assert(elements.size() > 0);
 }
 //assertThat(driver.findElement(By.linkText("Logout")).getText(), is("Logout"));
 driver.findElement(By.linkText("Logout")).click();
 Thread.sleep(3000);
 //assertThat(driver.getTitle(), is("Your store. Login"));
 
 System.out.println("Application title after logout: " + driver.getTitle());
 Assert.assertEquals("Your store. Login", driver.getTitle());
}
}

