package com.syntax.class04.HW;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("How old are you?");
		
		int input=scan.nextInt();
		 if(input>=18) {
			 
			 System.out.println("You are eligible for a driver lisence");
			 
		 }else {
			 System.out.println("You are under age, get learners permit");
			 
		 }
		 

	}

}
