package com.udemy.java8Features.streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities()
	{
		return StudentDatabase.getAllStudents()
		.stream()  // stream <Students>
		.map(Student::getActivities) // Stream <List<String>>
		.flatMap(List::stream) // Stram<String>
		.sorted()
		.distinct()
		.collect(Collectors.toList());
		
	}
	public static Long getStudentActivitiesCount()
	{
		Long no= StudentDatabase.getAllStudents()
		.stream()  // stream <Students>
		.map(Student::getActivities) // Stream <List<String>>
		.flatMap(List::stream)  // Stram<String>
		.distinct()
		.sorted()
		.count();
		return no;
		
	}
	public static void main(String[] args) {
	System.out.println(printStudentActivities());
	System.out.println("total no of activities : " +getStudentActivitiesCount());
	
	}
}
