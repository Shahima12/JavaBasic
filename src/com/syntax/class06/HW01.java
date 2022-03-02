package com.syntax.class06;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		String grade=scan.nextLine();
		
		switch (grade) {
		
		case "A":
			grade="Excellent";
			break;
			
		case "B":
			grade ="Good";
			break;
			
		case "C":
			grade = "Average";
			break;
			
		case "D":
			grade = "Bad";
			break;
			
			default:
				grade = "Not Acceptable";
				break;
		}
		
		System.out.println("Your grade is "+grade);
		
	}

}
