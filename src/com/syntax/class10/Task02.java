package com.syntax.class10;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		String[] countries = { "USA", "Canada", "Mexico" };
		String capital = null;
		for (String country : countries) {
			switch (country) {
			case "USA":
				capital = "Washington DC ";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			case "Mexico":
				capital = "Mexico City";
				break;
			}
			System.out.println("The capital of " + country + " is a " + capital);
		}
	}
}