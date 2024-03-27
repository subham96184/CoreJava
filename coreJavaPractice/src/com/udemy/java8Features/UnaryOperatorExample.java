package com.udemy.java8Features;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	// input and output are the same type in that scenario we can use Unary
	
	static UnaryOperator<String> unaryOperator=(s)->s.concat("subham ");
 	
	public static void main(String[] args) {
		
		System.out.println(unaryOperator.apply("geek " ));

	}

}
