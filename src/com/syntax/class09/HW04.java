package com.syntax.class09;

public class HW04 {

	public static void main(String[] args) {
		
		//Largest number Array Loop
		
		int[] num= {30000, 150, 200, 1000, 5500};
		
		int number=num[0];
		
		for (int i=0; i<num.length; i++) {
			if (num[i] > number) 
				number=num[i];
			
			}
		System.out.println("The largest number is "+number);
		
				
		}

	}


