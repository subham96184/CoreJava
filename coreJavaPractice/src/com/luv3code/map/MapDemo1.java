package com.luv3code.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		List<String> ls= Arrays.asList("sa","ssd","dfr");
		
		//convert all the names into upper case without using streams
		List<String> uppercase=new ArrayList<>();
		for(String string: ls)
		{
			String upperCase = string.toUpperCase();
			uppercase.add(upperCase);
		}
		
		System.out.println(uppercase);
		List<String> collect = ls.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> collect2 = ls.stream().map(name->name.toUpperCase()).collect(Collectors.toList());

		System.out.println(collect);
		System.out.println(collect2);
	}

}
