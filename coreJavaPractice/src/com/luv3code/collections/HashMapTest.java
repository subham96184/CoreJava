package com.luv3code.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1L);
		Employee e2 = new Employee(1L);

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, "john");
		map.put(e2, "maxi");
		System.out.println(map.size());
		for (Employee employee : map.keySet()) {
			System.out.println(employee.toString());
		}

	}

}
