package com.syntax.class13;

public class DifferentLanguageHW03 {
	
	String greeting (String country) {
		
		switch(country) {
		
		case "USA" :
			
			return "Hello";
			
		case "Turkey":
			
			return "Merhaba";
			
		case "Mexico":
			
			return "Hola";
			
		default:
			
			return "Unknown";
				
			
		}
	}

	public static void main(String[] args) {
		
		DifferentLanguageHW03 obj=new DifferentLanguageHW03();
		
		String country=obj.greeting("USA");
		
		System.out.println(country);

	}

}
