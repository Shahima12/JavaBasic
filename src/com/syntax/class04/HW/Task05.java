package com.syntax.class04.HW;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How long you have been working?");
		
		int input=scan.nextInt();
		if(input>=5) {
			
			System.out.println("What is your salary?");
			
			int input2=scan.nextInt();
			if(input2>50000) {
				
				System.out.println("Your bonus is 5000 dollars");
				
			}else {
				System.out.println("Your bonus is 3000 dollars");
				
			}
			
		}else {
			System.out.println("You are not eligible for the bonus");
			
			}
		}
	
	}
