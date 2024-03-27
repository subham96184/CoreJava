package com.udemy.java8Features.defaultAndStatic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		
		// sort the list of strings alphabetically
		
		List<String> strings=Arrays.asList("adam", "mike", "robert", "chris");
		
//		Collections.sort(strings);

	//	System.out.println(strings);
 strings.sort(Comparator.naturalOrder());
 strings.sort(Comparator.reverseOrder());
	System.out.println("by using list sort method: " +strings);
	}

}
