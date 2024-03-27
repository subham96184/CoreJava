package com.luv3code.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,34,5,6,7,8,8);
		//multiply bt 3 and store into some other collection
		
		ls.stream().map(t->t*3).forEach(System.out::println);

	}

}
