package com.luv3code.hashSet;

import java.util.HashMap;
import java.util.Objects;

public class EqualsAndHashCode {

	public static void main(String [] args)
	{
	
	Employee emp1=new Employee(1);
	Employee emp2=new Employee(1);
	
	HashMap<Employee, String> map=new HashMap<Employee, String>();
	map.put(emp1,"john");
	map.put(emp2,"john");
    System.out.println(map);	
}
}
class Employee
{
    int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
   
	}
