package com.luv3code.java8Features;

interface Calculator{
	/*
	 * void switchOn(); }
	 */
	void add(int a, int b);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		/*Calculator calculator= ()->
			System.out.println("switch on..");
		
calculator.switchOn();*/
		
		Calculator calculator= (int a,int b)->{
			System.out.println("total " +(a+b));
		};
		
		calculator.add(2, 10);
	}

}
