package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		/*
		 * Array - collection of values
		 * values inside array called elements
		 * elements inside array stored based on indexes.
		 * first index in Array starts from 0
		 * int[] numbers=new int[3];
		 * numbers [0]=10;
		 * numbers[1]=20;
		 * system.out.println(numbers[2]); //0
		 * 
		 */

		int num=1;
		
		//creating an array that holds 4 elements
		int[] numbers=new int[4];
		
		//storing values/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);//189
		
		//I want to create an array of countries
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		//countries[5]="Turkey"; ArrayIndexOutOfBoundsExeption
		
		//System.out.println(countries[5]); ArrayIndexOutOfBoundsExeption
		System.out.println(countries[3]+countries[4]);
	}

}
