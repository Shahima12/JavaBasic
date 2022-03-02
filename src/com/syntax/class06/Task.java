package com.syntax.class06;

public class Task {

	public static void main(String[] args) {

		String country="Bangladesh";
		
		String language;
		switch (country) {
		
		case "Brazil":
			language="Portuguese";
			break;
		
		case "China":
			language="Chinese";
			break;
			
		case "France":
			language="French";
			break;
			
		case "Bangladesh":
			language="Bangla";
			break;
			
		case "USA":
			language="English";
			break;
			
		default:
			language="Unknown";
			break;	
		
		}
		
		System.out.println("In "+country+" people speak "+language);
		
	}

}
