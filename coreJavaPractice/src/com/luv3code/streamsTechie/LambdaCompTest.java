package com.luv3code.streamsTechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
   int id;
   String name;
   double salary;
   public Employee(int id, String name, double salary) {
      super();
      this.id = id;
      this.name = name;
      this.salary = salary;
      
   }
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
public class LambdaCompTest {
   public static void main(String[] args) {
      List<Employee> list = new ArrayList<Employee>();

      // Adding employees
      list.add(new Employee(115, "Adithya", 25000.00));
      list.add(new Employee(125, "Jai", 30000.00));
      list.add(new Employee(135, "Chaitanya", 40000.00));
      System.out.println("Sorting the employee list based on the name");

      // implementing lambda expression
		/*
		 * Collections.sort(list, (p1, p2) -> { return p1.name.compareTo(p2.name); });
		 * d
		 */
      List<Employee> collect = list.stream().sorted((p1,p2)->p1.name.compareTo(p2.name)).collect(Collectors.toList());
      
      
    	  System.out.println( "Sorted by subham by names: " +collect);
      
      Collections.sort(list,(p1,p2)-> {
    	  return p1.name.compareTo(p2.name);
      });
      
      for(Employee e : list) {
         System.out.println(e.id + " " + e.name + " " + e.salary);
      }
   }
}