package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a day");
		
		String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
			System.out.println("There is no class");
			
		} else if (day.equalsIgnoreCase("Tuesday") || day.equals("Wednseda")) {
			System.out.println("There is manual testing calss");
			
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("There is no class");
			
		} else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
			System.out.println("There is Java programming class");
		}
		else {
			System.out.println("INVALID ENTRY");		
	}

}
}