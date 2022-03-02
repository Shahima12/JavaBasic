package com.syntax.class13;

public class GreaterNumberHW01 {
	
	int largestnum(int num1, int num2) {
		
		if(num1>num2) {
			
			return num1;
			
		}else {
			
			return num2;
		}
	}

	public static void main(String[] args) {
		
		GreaterNumberHW01 number=new GreaterNumberHW01();
		
		int maxnum=number.largestnum(150, 200);
		
		System.out.println(maxnum);

	}

}
