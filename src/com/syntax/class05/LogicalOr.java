package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {

		String day="Monday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			
			System.out.println("Ihave java class");
		
		}
		
		System.out.println("code outside of if statement");
		
		/* let's ask user what is today day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if (Monday or Friday) --> there is no class today
		 * else if (Tuesday or Wednesday) --> manual
		 * else if (Thursday) --> review class
		 * else if (Saturday or Sunday) --> java class
		 */
	}

}
