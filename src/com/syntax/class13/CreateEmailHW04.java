package com.syntax.class13;

public class CreateEmailHW04 {
	
	String email(String userName, String lastName, String emailType) {
		
		return userName+lastName+"@"+emailType+".com";
		
	}

	public static void main(String[] args) {
		
		CreateEmailHW04 method=new CreateEmailHW04();
		
		System.out.println(method.email("Shahima", "1998", "gmail"));
		

	}

}
