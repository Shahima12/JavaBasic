package com.syntax.reviewclass6;

public class MorePatterns {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			
			 for(int j=1; j<=5; j++) {
				 
				 if (i==1 || i==4 || j==1 || j==5) {
					 
				 System.out.print("*");
				 
				 }else {
					 System.out.print(" ");
				 }
			 }
			 
			 System.out.println();
			 
		}
		
		for(int a=1; a<=5; a++) {
			
			for(int b=1; b<=a; b++) {
				
				System.out.print(a);
			}
			System.out.println(" ");
		}
	}
}

