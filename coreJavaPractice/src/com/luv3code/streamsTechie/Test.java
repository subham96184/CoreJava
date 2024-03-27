package com.luv3code.streamsTechie;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String string = "ilovetechie";
		String[] split = string.split("");
		//System.out.println("split chars" + split);
		
		
		 
		Map<String, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(t -> t));
		System.out.println(collect);

		Map<String, Long> collect2 = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap ::new , Collectors.counting()));
		System.out.println("Map objects :  "+ collect2);
		
	 collect2.entrySet().stream().filter(t->t.getValue()==1).forEach(System.out::print);;
        
		/// duplicate chars
		  List<String> collect3 = Arrays.stream(split)
		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		  .entrySet()
		  .stream()
		  .filter(t->t.getValue()>1)
		  .map(Map.Entry ::getKey)
		  .collect(Collectors.toList());
		  System.out.println("duplicate chars : " +collect3);
		  // Non dup
		  List<String> collect5 = Arrays.stream(split)
				  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				  .entrySet()
				  .stream()
				  .filter(t->t.getValue()==1)
				  .map(Map.Entry ::getKey)
				  .collect(Collectors.toList());
				  System.out.println("Non duplicate chars : " +collect5);
				  
		  
		  String key = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		  .entrySet()
		  .stream()
		  .filter(t->t.getValue()==1)
		  .findFirst().get().getKey();
		  System.out.println("Key " +key);
		  
		  /// second highest number
		   
			
			  int[] arr= {11,3,5,6,7,2,21}; // List<int[]> asList = Arrays.asList(arr);
			  Integer integer =
			  Arrays.stream(arr).boxed().reduce((i1,i2)->i1>i2?i1:i2)
			  .get(); System.out.println(integer);
			 
		  // Longest string from an array
		  
		  String[] arr1= {"aa","aaa","adcds","dadadda"};
		  String string2 = Arrays.stream(arr1).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		  System.out.println(string2);
		  }
}
