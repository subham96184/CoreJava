package com.luv3code.streamsTechie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashSet {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		// putting values in the Map
		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);

		// Calling the function to sortbyKey
		sortbykey(map);
		
			
		}
	

	private static void sortbykey(Map<String, Integer> map) {
		 HashMap<String, Integer> temp=map.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue())).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e2, LinkedHashMap::new));
		
		for (Map.Entry<String, Integer> entry : temp.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key +"  "+val);
	}
}}
