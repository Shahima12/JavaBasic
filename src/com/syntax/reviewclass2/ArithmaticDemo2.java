package com.syntax.reviewclass2;

public class ArithmaticDemo2 {

	public static void main(String[] args) {

		/*
		 * + - * / % 
		 * 
		 */				
		int number1=10; // int only takes the whole number
		int number2=3;
		double number3=10;
		double number4=3;
		
		float number5=10;
		float number6=3;
		
		System.out.println(number1/number2);
		System.out.println(number3/number4);
		System.out.println(number5/number6);

		
		String name1="Abdul";
		String name2="Gulnar";
		System.out.println(name1+name2);
		
		char letter1='A'; //65
		char letter2='B'; //66
		System.out.println(letter1+letter2);
		
		float f=5.3f;// can replace with double
		if(f==5.3f) {
			System.out.println("Magic");
		}else {	
			System.out.println("Simple math");
		}
		
		// for decimal numbers always use int data type
		// for decimal numbers always use double data type
	}

}