package com.luv3code.java8Features.sortListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.luv3code.java8Features.apiExample.Employee;
import com.luv3code.java8Features.apiExample.EmployeeDAO;

public class SortListDemo {

	public static void main(String[] args) {
		
	
	List<Integer> list =new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(5);
	list.add(4);
	/*
	 * System.out.println(list); Collections.sort(list); System.out.println(list);
	 * Collections.reverse(list); System.out.println(list);
	 * 
	 * list.stream().sorted().forEach(s->System.out.println(" using strams "+s));
	 * list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println
	 * (s));
	 */
	List<Employee> employees=EmployeeDAO.getEmployees();
	/*
	 * Collections.sort(employees,new Comparator<Employee>() {
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return o2.getSalary()-o1.getSalary(); } });
	 */	
	//Collections.sort(employees, (o1,o2)-> o2.getSalary()-o1.getSalary());
	//System.out.println(employees);
	
	employees.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary())
	.forEach(e->System.out.println(e));

	employees.stream().sorted((o1,o2)->o1.getSalary()<o2.getSalary()?-1:1)
	.forEach(e->System.out.println(e));
	
	}
}
/*
 * class MyComparator implements Comparator<Employee> {
 * 
 * @Override public int compare(Employee o1, Employee o2) { // TODO
 * Auto-generated method stub return o2.getSalary()-o1.getSalary(); } }
 */