package com.udemy.java8Features;

public class FunctionExample {

	public static String perform(String string)
	{
		return FunctionInterfaceExample.addString.apply(string);
	}
	
	public static void main(String[] args) {
		
		System.out.println(perform("Hello"));;

	}

}
