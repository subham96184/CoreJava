package com.udemy.java8Features.streamsAPI;

import java.util.stream.Stream;

public class StreamOfGenerateInterate {

	public static void main(String[] args) {
		
		Stream<String> stringStream=Stream.of("shan","jr","maru");
		stringStream.forEach(System.out::println);
	}
}
 