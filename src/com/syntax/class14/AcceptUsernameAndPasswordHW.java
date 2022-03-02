package com.syntax.class14;

import java.util.Scanner;

public class AcceptUsernameAndPasswordHW {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter your Username");
		
		String username=input.nextLine();
		
		System.out.println("Please enter your Password");
		
		String password=input.nextLine();
		
		if(username.isEmpty()&& password.isEmpty()) {
			
			System.out.println("Username and Password cannot be empty");
			
		}else if (password.length()<8) {
			
			System.out.println("Password is too short");
			
		}else if (password.contains(username)) {
			
			System.out.println("Password cannot contain username");
			
		}else {
			System.out.println("Confirm your Password");
			
			String password1=input.nextLine();
			
			if (password1.equals("password")) {
				
				System.out.println("Password do not match");
				
			}else {
				
				System.out.println("Your Username and Password has been created.");
				
			}
		}
		

	}

}
