package com.syntax.class13;

public class MethodsDemo2 {
	
	//Create a method that takes an animal name and person name if name is equal to Teyfur and animal is Horse
	//print camel otherwise print horse
	
	void TeyfurAndHorse(String personName,String animalName) {
		
	
		if(personName.equals("Teyfur")&&animalName.equals("Horse")) {
			
		
			System.out.println("This is a Camel");
			
		}else if(animalName.equals("Horse")){
			
		
			System.out.println("This is a Horse");
		}
	}

	public static void main(String[] args) {
		
		MethodsDemo2 object=new MethodsDemo2();
		object.TeyfurAndHorse("Teyfur", "Horse");
		object.TeyfurAndHorse("Tarik", "Horse");

	}

}
