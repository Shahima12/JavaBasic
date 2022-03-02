package com.syntax.class06;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 =input.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = input.nextInt();
		
		System.out.println("Choose an operator: +, -, *, or /");
		char operator =input.next().charAt(0);

		int result=0;
		
		switch (operator) {
		
		case '+':
			result = number1 + number2;
			break;
			
		case '-':
			result = number1 - number2;
			break;
			
		case '*':
			result = number1 * number2;
			break;
			
		case '/':
			result = number1 / number2;
			break;
			
		default:
			System.out.println("Invalid");
		}
		System.out.println(number1+""+operator+""+number2+" = "+result);
		
	}

}
