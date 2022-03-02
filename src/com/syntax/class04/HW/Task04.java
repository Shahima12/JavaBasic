package com.syntax.class04.HW;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String input=scan.next();
		
		if (input.equalsIgnoreCase("Yes")) {
			
			System.out.println("What is the balance on your credit card?");
			
			double balance=scan.nextDouble();
			
			if (balance>1000) {
				
				System.out.println("Pay off immediately");
				
			}else {
				System.out.println("You need to spend more");
			}
				
			}else {
				System.out.println("Would you like to get a new credit card?");
				
			}
	}
	
}
