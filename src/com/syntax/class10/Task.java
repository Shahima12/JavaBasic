package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order
		
		int[] array = {10,20,30,40,50};
		
		for(int i=array.length-1; i >= 0; i--) {
			
			System.out.println(array[i] + "  ");
		}
	         

	}

}
