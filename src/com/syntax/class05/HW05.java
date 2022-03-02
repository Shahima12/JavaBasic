package com.syntax.class05;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your Quiz score");
		int Quiz=scan.nextInt();
		
		System.out.println("Please enter your Mid-term score");
		int midterm=scan.nextInt();
		
		System.out.println("Please enter your Final exam score");
		int finalexam=scan.nextInt();
		
		int score=Quiz+midterm+finalexam;
		int totalScore=score/3;
		
		if (totalScore>=90) {
			System.out.println("A");
			
		}else if (totalScore>=70 && totalScore<90) {
			System.out.println("B");
			
		}else if (totalScore>=50 && totalScore<70) {
			System.out.println("C");
			
		}else if (totalScore<50) {
			System.out.println("F");
		}

	}

}
