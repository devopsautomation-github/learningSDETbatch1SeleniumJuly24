package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {


		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("2");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    System.out.println("--------------------------");
//	    cars.add(0, "Mazda");
	    cars.set(0, "Mazda");
	    
	    System.out.println(cars);
	    Collections.sort(cars);
	    
	    System.out.println(cars);

	    
//	   ChromeDriver driver = new ChromeDriver();
//	   driver.get("");
//	   
//	   
//	   driver.findElements(By.className(""));  //// list
//	   
//	   
//	   
//	   driver.getWindowHandles();              //// set------- 
		
		
	}

}
