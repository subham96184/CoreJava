package com.udemy.java8Features.streamsNew;

import java.util.Optional;
import java.util.stream.Stream;

public class Examples {

	public static void main(String[] args) {
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		//Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
		//if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get());

	  Integer reduce = numbers.reduce(1,(i1,i2)->i1*i2);
	  System.out.println(reduce);
	}

}
