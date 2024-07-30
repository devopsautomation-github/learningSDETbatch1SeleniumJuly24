package exercise;

public class Assert {
	
	
	
	public static void assertEquals(String actual, String expected) {
		
		
		
		if(actual.equalsIgnoreCase(expected)) {
			
			
			System.out.println("validation pass !!");
		}
		
		else  {
			
			System.out.println("validation failed !!");
			System.out.println("actual title: " + actual);
		}
		
		
		
	}
	
	
	public static void assertEquals(String actual, String expected, String errorMessage) {
		
		
		
		if(actual.equalsIgnoreCase(expected)) {
			
			
			System.out.println("validation pass !!");
		}
		
		else  {
			
			System.out.println("validation failed !!");
			System.out.println("actual title: " + actual);
			System.out.println("errorMessage: " + errorMessage);
		}
		
		
		
	}

}
