package com.syntax.class06;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {

		Scanner calc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=calc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=calc.nextInt();
		
		System.out.println("Choose an operator: +, -, *, or /");
		char operator=calc.next().charAt(0);
		
		int result=0;
		
		if (operator=='+' ) {
			result=num1+num2;
			
		}else if (operator=='-') {
			result=num1-num2;
			
		}else if (operator=='*') {
			result=num1*num2;
			
		}else if (operator=='/') {
			result=num1/num2;
			
		}else {
			System.out.println("Invalid");
		}
		System.out.println(num1+""+operator+""+num2+" = "+result);
		
	}

}
