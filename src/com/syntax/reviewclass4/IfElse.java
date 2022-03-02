package com.syntax.reviewclass4;

public class IfElse {

	public static void main(String[] args) {

		String month ="Jan";
		int day =1;
		
		if("Jan".equals(month)) {
			if(day==1) {
			System.out.println("it is the first of Jan");
			
			}else {
				System.out.println("It is Jan but not first of Jan");
				
			}
			
		}else {
			System.out.println("it is not Jan");
			
		}
	}

}
