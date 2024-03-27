package com.udemy.java8Features.streamsAPI;

import com.udemy.java8Features.data.StudentDatabase;

public class StreamsMatchExample {

	public static boolean allMatch() {
		
		return StudentDatabase.getAllStudents().stream().allMatch(student->student.getGpa()>6);
	}
public static boolean anyMatch() {
		
		return StudentDatabase.getAllStudents().stream().anyMatch(student->student.getGpa()>6);
	}


	public static boolean NoneMatch() {
		
		return StudentDatabase.getAllStudents().stream().noneMatch(student->student.getGpa()>6);
	}
	public static void main(String[] args) {
		
		System.out.println(allMatch());
		System.err.println(anyMatch());
		System.err.println(NoneMatch());
	}

}
