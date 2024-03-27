package com.udemy.java8Features.numericStreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

	public static void main(String[] args) {
		
		IntStream intStream= IntStream.range(1, 50);
		IntStream intStreamClosed= IntStream.rangeClosed(1, 50);
		System.out.println(intStream.filter(null));
		System.out.println(intStream.count());
		System.out.println(intStreamClosed.count());		
	}
}
