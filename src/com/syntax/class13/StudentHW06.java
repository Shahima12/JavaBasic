package com.syntax.class13;

public class StudentHW06 {
	
	char getGradeScore (int score) {
		if (score>=90) {
			return 'A';
					
		}else if (score>=80) {
			return 'B';
			}else if (score>=70) {
				return 'C';
			}else if (score>=50) {
				return 'D';
				
			}else {
				return 'F';
			}
	}

	public static void main(String[] args) {
		
		StudentHW06 grade=new StudentHW06();
		
		System.out.println(grade.getGradeScore(80));

	}

}
