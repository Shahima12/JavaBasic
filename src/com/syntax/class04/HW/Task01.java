package com.syntax.class04.HW;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How much loan do you need?");
		
		int imput=input.nextInt();
		
		if(imput<=200000) {
			System.out.println("You are eligible for the loan.");
		}else {
			System.out.println("Can not give you loan it is above your limit");
			
		}

	}

}
