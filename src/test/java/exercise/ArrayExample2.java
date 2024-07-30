package exercise;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class ArrayExample2 {
	
	
	//Unit Testing Framework   ------ JUNIT/TESTNG
	
	//annotation ----- @Test
	
	
	
	@Test
	public void verifyArrayTest() {
		
		
		//Array Example
		//one dim-array
		
		//						0				1			 2		 3
		String[] superHero = { "IronMan", "Capt. America", "Vision", "Hulk", "Thor"};
		
		
		System.out.println("Element Count: " +superHero.length);
		
		
		
		System.out.println(superHero[1]);
		System.out.println("---------------before the loop-----------------------");
		
		//							 4
		for (int ele = 0; ele < superHero.length; ele++) {
			
			
			
//			System.out.println(ele);
			System.out.println(superHero[ele]);
			
			
			if(superHero[ele].equalsIgnoreCase("Vision")) {
				
				System.out.println("**********avenger found***********");
//				break;
				
			}
			else {
				
				System.out.println("----------------------------");
				
			}
			
			
		}
		
		
		System.out.println("---------------outside loop----------------------");
		
		
		
		
		
	}
	
	
	

}
