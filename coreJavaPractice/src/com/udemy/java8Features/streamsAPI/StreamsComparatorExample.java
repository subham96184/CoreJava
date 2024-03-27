package com.udemy.java8Features.streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsComparatorExample {

	public static List<Student> printStudentsByNames()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	public static List<Student> printStudentsBygpa()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	public static List<Student> printStudentsByGrade()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGrade))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		System.out.println(printStudentsByNames());
		
		// both for each are same bro
		printStudentsByNames().forEach((student)->System.out.println(student));
		
		System.out.println("...........");
		printStudentsBygpa().forEach(System.out::println);

	}

}
