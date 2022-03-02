package com.syntax.class05;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("What time is it now?");
		
		double hour=scan.nextDouble();
		
		if (hour>=1 && hour<=11) {
			System.out.println("It is Morning");
			
		}else if (hour>=12 && hour<=15) {
			System.out.println("It is Afternoon");
			
		}else if (hour>=16 && hour<=20) {
			System.out.println("It is Evening");
			
		}else if (hour>=21 && hour<=24) {
			System.out.println("It is Night");
			
		}else {
			System.out.println("Invalid time");
		}
		
	}

}
