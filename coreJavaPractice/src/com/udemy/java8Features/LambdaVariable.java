package com.udemy.java8Features;

import java.util.function.Consumer;

public class LambdaVariable {

	public static void main(String[] args) {
		
		// do not allowed local variables in lambda functions

		// cannot modify that is being used in lambda expression
	Consumer<Integer> inConsumer=(i)->
	{
		System.out.println(i);
	};
	}

}
