package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import junit.framework.Assert;

public class LoginPage {
	
	
	WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		
		
		System.out.println("==============pagefactory Concept=====================");
		
//		this.driver = rdriver;
		
		driver = rdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Identification
//	By txtEmail = By.cssSelector("input#Email");
//	By txtPass = By.id("Password");
//	By chkRem = By.xpath("//input[@name='RememberMe']");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("Logo");
	
	
	
	@FindBy(how = How.CSS, using="input#RememberMe")
	private WebElement rememberMe;
	
	
	
	
	public void clickOnRememberMe(){
		
		rememberMe.click();
	}
	
	
	
	
	
	
	
	
	@FindBy(how = How.CSS, using = "input#Email")
	WebElement txt_Email1;
	
	@FindBy(css = "input#Email")
	WebElement txt_Email;
	
	
	
	@FindBy(id = "Password")
	WebElement txt_Pass;
	
	@FindBy(xpath  = "//input[@name='RememberMe']")
	WebElement chk_Rem;
	
	@FindBy(tagName = "button")
	WebElement btn_login;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btn_logout;
	
	
	
	
	//methods/Actions
	
	public void enterEmail(String email) {
		
		txt_Email1.clear();
		txt_Email.sendKeys(email);
		
		
	}
	
	
	public void enterPass(String pwd) {
		
		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);
		
		
	}
	
	public void clickCheckbox() {
		
		chk_Rem.click();
		
		
		
	}
	
public void clickLoginButton() {
		
		btn_login.click();
		
		
		
	}

public void clicklogoutButton() {
	
	btn_logout.click();
	
	
	
}

public void verifyApplicationTitle(String expTitle) throws Exception {
	
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), expTitle);
	
	
	
}
	
	public void enterEmail() {
		
		txt_Email.clear();
		txt_Email.sendKeys("defaultValue@LearnQuest.com");
		
		
	}
	

}
