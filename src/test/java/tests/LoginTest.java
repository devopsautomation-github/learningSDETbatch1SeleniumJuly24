package tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		lp.enterEmail("admin@yourstore.com");  ///hard coded value
		lp.enterPass("admin");
		lp.clickOnRememberMe();
		lp.clickLoginButton();
		
		//validation Step
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		
		lp.clicklogoutButton();
		lp.verifyApplicationTitle("Your store. Login");
		
	}

}
