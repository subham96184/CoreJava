package com.luv3code.java8Features.apiExample;

import java.util.List;
import java.util.stream.Collectors;

public class EmpSevice {

	public List<Employee> taxEmployees() {
		/*
		 * return EmployeeDAO.getEmployees().stream().filter(e->e.getSalary()>500000)
		 * .collect(Collectors.toList());
		 */
		return EmployeeDAO.getEmployees().stream().filter(e -> e.getSalary() > 4000).collect(Collectors.toList());
	}
	public List<Employee> taxEmployeesInCal() {
		/*
		 * return EmployeeDAO.getEmployees().stream().filter(e->e.getSalary()>500000)
		 * .collect(Collectors.toList());
		 */
		return EmployeeDAO.getEmployees().stream()
				.filter(e -> e.getSalary() >= 600000 && e.getCity().equalsIgnoreCase("california"))		
				.collect(Collectors.toList());
	}


	public static void main(String[] args) {

		EmpSevice sevice = new EmpSevice();
		System.out.println(sevice.taxEmployees());
		System.out.println(sevice.taxEmployeesInCal());
	}
}
