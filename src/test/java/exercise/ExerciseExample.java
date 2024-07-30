package exercise;

import java.util.Scanner;

public class ExerciseExample {

	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in); //create a scanner object
		
		System.out.println("===============enter email=======================");
		
		
		String email = myObj.nextLine();			// read user inputs
		
		
		long num = myObj.nextLong();
		
		
		double db = myObj.nextDouble();
		
		System.out.println("Email id: " + email);

	}

}
