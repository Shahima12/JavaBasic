package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		
String[][] names=new String[3][4];
		
		//1 row or 1 array
		names[0][0]= "Mr";
		names[0][1]= "Mrs";
		names[0][2]= "Ms";
		names[0][3]= "Miss";
		
		//2 row or second array
		
		names[1][0]= "Smith";
		names[1][1]= "Jordan";
		names[1][2]= "Jackson";
		names[1][3]= "Obama";
		
		System.out.println(names[0][1]+" "+names[1][0]+", "+names[0][0]+" "+names[1][3]+", "+names[0][2]+" "+names[1][2]+", "+names[0][3]+" "+names[1][1]);
		
		
				
		}

	}

