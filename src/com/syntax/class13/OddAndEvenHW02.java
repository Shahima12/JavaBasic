package com.syntax.class13;

public class OddAndEvenHW02 {
	
	void checkOddEven (int num) {
		
		if (num%2==0) {
			
			System.out.println("Odd");
			
		}else {
			
			System.out.println("Even");
		}
	}

	public static void main(String[] args) {
		
		OddAndEvenHW02 method=new OddAndEvenHW02();
		
		method.checkOddEven(35);
	
		method.checkOddEven(40);
	

	}

}
