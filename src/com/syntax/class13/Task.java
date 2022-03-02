package com.syntax.class13;

public class Task {
		
		String TeyfurAndHorse(String personName,String animalName) {
			
		if(personName.equals("Teyfur")&&animalName.equals("Horse")) {
			return "Camel";
		
			
		}else if(animalName.equals("Horse")){
			
		return "Horse";
		
		}else {
			return "I don't Know";
		}
	}

	public static void main(String[] args) {
		
		Task object=new Task();
		String result=object.TeyfurAndHorse("Teyfur", "Horse");
		
		System.out.println(result);

	}

}
