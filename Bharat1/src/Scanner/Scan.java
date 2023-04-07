package Scanner;

import java.util.Scanner;

import JAVABasics.Demovariableb;

public class Scan {
	
	public static void main(String[] args) {
		 Scanner demo= new Scanner(System.in);//Scanner class Object
		 System.out.println("Enter the intiger :");
		 
		int value = demo.nextInt();
		 System.out.println("You entered value is :" +value);
		 System.out.println();
		 
		 System.out.println("Enter the float :");
		 
		float value1 = demo.nextFloat();
		 System.out.println("You entered value is : "+value1);
		 System.out.println();
		 
		 System.out.println("Enter the String :");
		 
		String value2 = demo.next();
	
		 System.out.println("You entered value is : " +value2);
		 System.out.println();
	
		 
	}

}
