package com.udemy.java8Features.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitAndSkip {

	public static Optional<Integer> limit(List<Integer> list) {
	
		return list.stream().limit(2).reduce((x,y)->x+y);
	}
	public static Optional<Integer> skip(List<Integer> list) {
		
		return list.stream().skip(2).reduce((x,y)->x+y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(3,4,5,7,99,9,9);

		Optional<Integer> limit=limit(list);
		if(limit.isPresent()) {
		System.out.println("limit of total : " +limit.get());
		}
		else {
			System.out.println("value not present");
		}

		Optional<Integer> skiOptional=skip(list);
		if(skiOptional.isPresent()) {
		System.out.println("skip of total : " +skiOptional.get());
		}
		else {
			System.out.println("value not present");
		}
	}

}
