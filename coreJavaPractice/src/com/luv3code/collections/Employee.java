package com.luv3code.collections;

import java.util.Objects;

public class Employee {

	public void emthod(Employee e) {
		System.out.println("e method");
	} 
	public void emthod2(){
		System.out.println("e method");
		
	} 
	
	
	private Long id;

	public Employee(Long id) {

		this.id = id;
	}

	public Employee(int i, String string, double d) {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}	
}
