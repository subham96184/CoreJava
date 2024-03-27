package com.udemy.java8Features.streamApiTerminal;

import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamJoining {

	
	public static String joining_1()
	{
		return StudentDatabase.getAllStudents()
		.stream().map(Student::getName)
		.collect(Collectors.joining());
	}
	public static String joining_2()
	{
		return StudentDatabase.getAllStudents()
		.stream().map(Student::getName)
		.collect(Collectors.joining(".."));
	}
	public static String joining_3()
	{
		return StudentDatabase.getAllStudents()
		.stream().map(Student::getName)
		.collect(Collectors.joining("..", "(", ")"));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("joing one: " + joining_1());
		System.out.println("joing one: " + joining_2());
		System.out.println("joing one: " + joining_3());
	}

}
