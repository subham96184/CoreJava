package com.luv3code.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> ls= Arrays.asList("sa","ssd","dfr");
		// find the lenght of every string 
		
		 ls.stream().map(t->t.length()).forEach(len->System.out.println(len));
		
	}

}
