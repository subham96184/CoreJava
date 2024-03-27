package com.udemy.java8Features.methodReference;

import java.util.function.Consumer;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class MethodRefUsingConsumer {

	static Consumer<Student> c1=System.out::println;
	
	public static void main(String[] args) {
		
		StudentDatabase.getAllStudents().forEach(c1);
		
	}
}
