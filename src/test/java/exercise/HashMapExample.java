package exercise;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		//key and value 
		
		
		HashMap<String, String> IBM_Project = new HashMap<String, String>();
		
		
		IBM_Project.put("projectID", "ABC123");
		IBM_Project.put("org", "IBM");
		IBM_Project.put("clientName", "XYZ org");
		IBM_Project.put("budget", "1231232");
		
		
		 
//		String x = IBM_Project.get("projectID");
		
		System.out.println("Project ID value are: " + IBM_Project.get("projectID"));
		System.out.println("Project ID value are: " + IBM_Project.get("clientName"));
		System.out.println("Project ID value are: " + IBM_Project.get("clientName11"));
		System.out.println("Project ID value are: " + IBM_Project.get(""));
		
		

	}

}
