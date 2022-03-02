package com.syntax.reviewclass6;

public class World {

	public static void main(String[] args) {
		
		Human human1=new Human();
		human1.name="John";
		human1.lastName="Doe";
		human1.eyeColor="Blue";
		human1.hairColor="Grey";
		human1.age=33;
		human1.gender='M';
		
		//human1.hands=2; CE: hands was not declared in the Human class
		human1.sleep();
		human1.eat();
		human1.run();
		
		//human1.tired(); CE:tired method was not defined in the Human class
		

	}

}
