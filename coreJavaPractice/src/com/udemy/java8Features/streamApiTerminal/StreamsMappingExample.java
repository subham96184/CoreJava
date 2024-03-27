package com.udemy.java8Features.streamApiTerminal;

import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsMappingExample {

	public static void main(String[] args) {
		/*
		List<String> students= StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName,Collectors.toList()));
System.out.println(students);
*/
		 List<String> collect = StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
System.out.println(collect);
	}
	
}
