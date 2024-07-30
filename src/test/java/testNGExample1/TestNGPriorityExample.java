package testNGExample1;

import org.testng.annotations.Test;

public class TestNGPriorityExample {
	
	//login ------additem -----cancelOrder ---- payment ---- logout
	
	// -100 -----    0    ----     1   ------     1    -----  2     
	//execution ---- naming conv ----alpha 
	
	//Priority
	
	//Highest negative number having highest priority
	//by default priority ----- 0
	//if priority is same ----- as per naming conv ---alphabetic order
	
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
	}

	
	
	@Test(priority = 2)
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case");
	}
	
	
	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}
	
	@Test(priority = 1)
	public void payment() {
		
		System.out.println("payment test case");
	}
	
	@Test(priority = 1)
	public void UPIpayment() {
		
		System.out.println("UPI payment test case");
	}
}
