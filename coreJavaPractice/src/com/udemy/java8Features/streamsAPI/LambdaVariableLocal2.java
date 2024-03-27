package com.udemy.java8Features.streamsAPI;

import java.util.function.Consumer;

public class LambdaVariableLocal2 {

	public static void main(String[] args) {
		
		// not allowed to pass local variable name in method paramter
		
		// we cannot modify local variables in lambda expressions
		
		
		int value=9;
		Consumer<Integer> consumer=(v)->{
		System.out.println(value);

		};
		consumer.accept(5);
	}

}
