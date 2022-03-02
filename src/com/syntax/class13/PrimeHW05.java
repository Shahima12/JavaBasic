package com.syntax.class13;

public class PrimeHW05 {
	
	String prime(int number) {
		
		if (number < 1) {
			
			return "The number " + number + " is not prime";
			
		} else if (number > 1) {
			
			for (int i = 2; i < number; i++) {
				
				if (number % i == 0) {
					
					return "The number " + number + " is not prime";
				}
			}
		}
		return "The number " + number + " is prime"; 
	}
	public static void main(String[] args) {
		
		PrimeHW05 obj = new PrimeHW05();
		
		System.out.println(obj.prime(9));
		
		System.out.println(obj.prime(2));
	}
}


