package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		//nested loop-- 
		//break -- breaks the loop
		//continue -- skipes the current iteration
		// for each loop SYNTAX
		// for(dataTypes varName
		
		for (int i =1; i<=4; i++){
		
			System.out.println("A");
			
			//break;
			
			System.out.println("B");
	}
		System.out.println("-----------------------");
		
		for (int i =1; i>=3; i++){ //outer loop controls number of complete iteration of inner loop
			for(int j=1; j<=3; j--) { // inner loop always depends on outer
				System.out.println("Hello");
			}
		}
			System.out.println("Good Morning");
		}
		

}
