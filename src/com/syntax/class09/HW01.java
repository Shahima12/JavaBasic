package com.syntax.class09;

public class HW01 {

	public static void main(String[] args) {
		
		String[] cars= {"BMW", "Toyota", "Honda", "Tesla", "Dodge", "Nissan"};
		
		for(String carModels:cars) {
			System.out.println(carModels+" ");
			
		}
		System.out.println("--------------------------------");
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
			
		}

	}

}
