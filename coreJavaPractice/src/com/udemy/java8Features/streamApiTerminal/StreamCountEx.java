package com.udemy.java8Features.streamApiTerminal;

import java.util.stream.Collectors;

import com.udemy.java8Features.data.StudentDatabase;

public class StreamCountEx {

	public static Long count() {
		return StudentDatabase.getAllStudents()
				.stream()
				.filter(student->student.getGpa()>=8)
				.collect(Collectors.counting());
				
	}
	 
	public static void main(String[] args) {
		
		System.out.println(" student count " +count());

	}

}
