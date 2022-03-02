package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {
	
	//void id type of methods that don't return anything when called
	//checkEvenOdd id the name of the method
	
	void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
	}
	void edward(boolean isRaining) {
		if(isRaining) {
			System.out.println("I am staying home");
			
		}else {
			System.out.println("lets go for a walk");
		}
	}
	//create a method to check a name if name is Teyfur it prints
	//send memes otherwise if name is Maha prints i am a doctor
	//prints i dont know you 
	void checkPerson(String name) {
		
		if("Teyfur".equals(name)) {
			
			System.out.println("Memer");
			
		}else if ("maha".equals(name)) {
			
				System.out.println("Doctor");
			}else {
				System.out.println("unknown");
		}
	}
	public static void main(String[] args) {
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.edward(false);
		
		object1.checkPerson("Teyfur");
		object1.checkPerson("Maha");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		//int number2=object1.checkEvenOdd(120);
	}

}
