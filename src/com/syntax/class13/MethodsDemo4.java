package com.syntax.class13;

public class MethodsDemo4 {
	
	//create a method that takes a boolean isSaleOn double price double discount
	//if IsSaleOn=true return discounted price otherwise return original price
	
	double discount(boolean isSaleOn, double price, double discount) {
		if(isSaleOn) {
			return (price-price*discount);
		} else {
			return price;
		}
	}
	
	void methodWithOutParameters() {
		
	}

	public static void main(String[] args) {
		MethodsDemo4 object=new MethodsDemo4();
		
		System.out.println(object.discount(false, 100, .15));
		System.out.println(object.discount(true, 100, .15));
		

	}

}