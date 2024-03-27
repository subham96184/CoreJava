package com.udemy.java8Features.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {

	static Function<String, String> Function=(String)->String.concat("john");

	static Function<String, String> RefFunction=String::toUpperCase;
	public static void main(String[] args) {
		
		System.out.println(Function.apply("leiisa "));

		System.out.println(RefFunction.apply("leiisa "));

	}
}
