package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		//create an array of countries. while retrieving all values from an array print capital of each country.
		
		String[] country= {"Portugal", "USA", "Canada","Germany", "France"};
		String[] capital= {"Lisbon", "Washington DC", "Ottawa", "Madrid", "Paris" };
		
		for (int i=0; i<country.length; i++) {
			System.out.println(capital[i]+" is the capital of "+country[i]);
		}
			System.out.println("-------------------------");
			
		}
}



