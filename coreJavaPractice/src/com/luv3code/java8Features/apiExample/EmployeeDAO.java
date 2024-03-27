package com.luv3code.java8Features.apiExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public static List<Employee> getEmployees()
	{
		List<Employee> list =new ArrayList<>();
		list.add(new Employee(1000, "john", "melbourne", 500000));
		list.add(new Employee(1006, "Manjohn", "california", 600000));
		list.add(new Employee(1005, "Dejohn", "lodon", 900000));
		list.add(new Employee(1003, "ejohn", "bourne", 1200000));
		
		return list;
	}
}
