package com.luv3code.java8Features.sortListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.luv3code.java8Features.apiExample.Employee;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A",100);
		map.put("J",104);
		map.put("Z",10);
		map.put("F",180);
		map.put("X",110);
		
		List<Entry<String, Integer>> entries=
				new ArrayList<>(map.entrySet());
		
		/*
		 * Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Entry<String, Integer> o1, Entry<String,
		 * Integer> o2) { // TODO Auto-generated method stub return
		 * o2.getKey().compareTo(o1.getKey()); } }); for(Entry<String, Integer>
		 * e:entries) { System.out.println(e.getKey()+ "  "+e.getValue()); }
		 */
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		//.forEach(e->System.out.println(e));
		
		
		
		Map<Employee, Integer> employeeMap=new HashMap<>();
		employeeMap.put(new Employee(99, "hohn", "mali", 6500), 101);
		employeeMap.put(new Employee(11, "john", "Bamali", 9500), 105);
		employeeMap.put(new Employee(3, "Mohn", "Ammali", 4500), 102);
		employeeMap.put(new Employee(4, "Shohn", "Gamali", 5500), 103);
		employeeMap.put(new Employee(7, "Rohn", "Dmali", 8500), 104);
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getCity)))
		.forEach(System.out::println);
		
		
	}
}
