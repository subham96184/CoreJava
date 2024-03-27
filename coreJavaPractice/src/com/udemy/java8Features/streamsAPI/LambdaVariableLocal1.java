package com.udemy.java8Features.streamsAPI;

import java.util.function.Consumer;

public class LambdaVariableLocal1 {

	public static void main(String[] args) {
		
		// not allowed to pass local variable name in method paramter
		
		
	//	int i=0;
		Consumer<Integer> consumer=(i)->System.out.println(i);

	}

}
