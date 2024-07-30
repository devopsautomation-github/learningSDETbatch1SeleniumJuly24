package testNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
	
	
	@Test
	public void login() {
		
		System.out.println("login test execution started......");
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test execution started......");
		Assert.assertTrue(true);
	}

}
