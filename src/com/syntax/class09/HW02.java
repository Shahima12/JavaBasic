package com.syntax.class09;

public class HW02 {

	public static void main(String[] args) {
		
		String[] animals=new String[5];
		
		animals[0]="Dog";
		animals[1]="Cat";
		animals[2]="Horse";
		animals[3]="Rabbit";
		animals[4]="Sheep";
		System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);
	
	System.out.println("------------------------");
	
	for(String animal:animals) {
		System.out.println(animal);
	}
}
}

		

