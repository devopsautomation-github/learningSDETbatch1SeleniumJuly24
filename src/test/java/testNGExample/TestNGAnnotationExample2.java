package testNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotationExample2 {
	
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test execution started......");
	}
	
	@Test
	public void cancelOrder() {
		
		System.out.println("cancelOrder test execution started......");
		Assert.assertTrue(false);
	}

}
