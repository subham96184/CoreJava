package com.udemy.java8Features;

import java.util.function.Function;

public class FunctionInterfaceExample {

	// pass two arguments input and return output
	static Function<String, String> function=(name)->name.toUpperCase();
	static Function<String, String> addString=(name)->name.toUpperCase().concat("default");
	
	public static void main(String[] args) {
		System.out.println(function.apply("java"));
		System.out.println(function.andThen(addString).apply("java "));
		System.out.println(function.compose(addString).apply("java "));
	}

}
