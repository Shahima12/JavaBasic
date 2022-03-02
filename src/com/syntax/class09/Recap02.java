package com.syntax.class09;

public class Recap02 {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) { //outer loop controls number of complete iteration of inner loop
			
			for(int j=1; j<=3; j++) { // inner loop always depends on outer
				
				System.out.println("Hello");
				break;
			}
		
			System.out.println("Good Morning");
		}
		System.out.println("----------------------");
		
	for (int i=1; i<=3; i++) { 
			
			for(int j=1; j<=3; j++) {
				
				System.out.println("Hello");
				break;
			}
		
			System.out.println("Good Morning");
			break;
	}
	System.out.println("----------------------");
	
	for(int i=0; i<=3; i++) {
		
		System.out.println("Hello");
	
		
		for (int j=1; j<=4; j++) {
			System.out.println("Good Morning");
			
		}
		
		System.out.println("----------------------");
		
		for(int a=0; a<=3; a++) {
			if (a==1) {
				continue;
			}
		
			for (int j=1; j<=4; j++) {
				if (j ==2) {
					continue;
				}
				System.out.println("Good Morning");
			}
				System.out.println("Hello");
			}
	}
	}

}
