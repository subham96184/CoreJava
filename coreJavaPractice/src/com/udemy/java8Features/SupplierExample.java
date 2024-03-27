package com.udemy.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<Student> studentSupplier=()->{
		return new Student("john", 6, 7d, "male", Arrays.asList("a","b"));
		};
System.out.println(studentSupplier.get());

Supplier<List<Student>> stSupplier=()->StudentDatabase.getAllStudents();

System.out.println(stSupplier.get());
	}

}
