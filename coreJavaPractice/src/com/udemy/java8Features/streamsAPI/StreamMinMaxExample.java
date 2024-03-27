package com.udemy.java8Features.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample{
	
	public static int findMaxMin(List<Integer> integers)
	{
		return integers.stream().reduce(1,(x,y)->x<y?x:y);
		
	}
	
	public static Optional<Integer> findMaxMinOptional(List<Integer> integers)
	{
		return integers.stream().reduce((x,y)->x>y?x:y);
		
	}
	
	public static void main(String[] args) {
		
		//List<Integer> list=new ArrayList<>();
		List<Integer> list=Arrays.asList(1,2,3,5,6);
		System.out.println("max : " + findMaxMin(list));
		
		Optional<Integer> maxValueOptional=findMaxMinOptional(list);
		if(maxValueOptional.isPresent()) {
		System.out.println("max : " +maxValueOptional.get());
		}
		else {
			System.out.println("value not present");
		}
	}
}