package com.syntax.class04.HW;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your city?");
		
		String city=scan.next();
		
		System.out.println("What is the temperature in "+city);
		
		float F=scan.nextFloat();
		float C=((F-32)*6)/9;
		
		System.out.println("The temperature in "+city+" is "+C+" degrees");
		
		
		

	}

}
