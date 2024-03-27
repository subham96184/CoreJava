package com.udemy.java8Features.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDe {

	public static void main(String[] args) {
		List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		
		List<String> collect = colors.stream()
				.filter(t->t.startsWith("g"))
				.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}

}
