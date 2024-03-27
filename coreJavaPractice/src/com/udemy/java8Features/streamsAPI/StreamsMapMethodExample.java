package com.udemy.java8Features.streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsMapMethodExample {

	public  static List<String> printNames()
	{
     	List<String> studentList =StudentDatabase.getAllStudents()
    		 .stream()
    		 .map(Student::getName)
    		 .collect(Collectors.toList());
     	return studentList;
	}
	public static void main(String[] args) {
	
	System.out.println(printNames());

	}

}
