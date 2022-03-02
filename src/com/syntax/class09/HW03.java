package com.syntax.class09;

public class HW03 {

	public static void main(String[] args) {
		
		int[] num= {2, 4, 6, 8, 10};
		
		int total= (num[0] + num[1] + num[2] + num[3] + num[4]);
		
		System.out.println("The sum of all the numbers are " +total);
	
		
		
	int[] numbers = { 15, 45, 10, 32 };
	int size = numbers.length;
	int sum = 0;
	for (int i = 0; i < size; i++) {
		sum += numbers[i];
	}
	System.out.println("Sum of all elements in the array = " + sum);
	
	sum=0;
	for (int nums: numbers) {
		sum+=nums;
		
	}
	System.out.println("Sum of all elements in the array = " + sum);
}
}



	