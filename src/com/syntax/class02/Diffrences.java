package com.syntax.class02;

public class Diffrences {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Byte";
		
		int c=10;
		int d=20;
		int sum=c+d;
		
		System.out.println(c+d+a+b);//30HelloBye
		
		System.out.println(a+b+c+d);//HelloByte1020
		
		System.out.println(a+b+(c+d));//HelloByte30
		
		int num=123;
		String num2="123";
		
		String what=num+num2;
		System.out.println(what); //123123
		
		System.out.println(num+num2);//123123
		
	}

}
