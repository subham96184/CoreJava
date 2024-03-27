package com.udemy.java8Features.defaultAndStatic;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
	
		Multiplier multiplier=new MultiplierImpl();
		List<Integer> integer =Arrays.asList(4,2,4,5);
		System.out.println("result is " + multiplier.multyply(integer));
		System.out.println("default method size "+multiplier.size(integer));
		System.out.println(Multiplier.isEmpty(integer));
				
	}
}
