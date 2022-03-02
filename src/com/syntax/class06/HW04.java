package com.syntax.class06;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Is that item is on sale?");
		
		String sale=scan.next();
		
		if (sale.equalsIgnoreCase("Yes")) {
			
			System.out.println("What is the price for the item?");
			int price=scan.nextInt();
			double percent=0;
			
			if(price<20) {
				percent=0.1;
			}else if(price>20 && price<100) {
				percent =0.2;
				
			}else if(price>100 && price<500) {
				percent=0.3;
				
			}else {
				percent=0.5;
			}
			double discount=percent*100;
			double finalPrice=price-discount;
			System.out.println("After the "+ discount+" % discount, the price of the item reduce from $ "+price +" to $ "+finalPrice);
			
		}else if(sale.equalsIgnoreCase("No")) {
			System.out.println("You are not going to shopping!");
			
		}
		
		
		
		
		
		
	}

}
