package com.udemy.java8Features.streamsAPI;

import java.util.Iterator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamFilterExample {

	public static List<Student> filterStudents() {
	 return	StudentDatabase.getAllStudents()
		.stream()
		.filter((student->(student.getGender().equals("female"))))
		.collect(Collectors.toList());
	}
	public static long filterStudentsCount() {
		 return	StudentDatabase.getAllStudents()
			.stream()
			.filter(t->!(t.getGender().equalsIgnoreCase("female"))).count();
		}
		
	public static List<Student> filterStudentsByStart() {
		 return	StudentDatabase.getAllStudents()
			.stream()
			.filter(t->t.getName().startsWith("s")).collect(Collectors.toList());
		}
	
	public static void main(String[] args) {
		
		//System.out.println(filterStudents());
		/*
		 * for (Student student : filterStudents()) { System.out.println(student); }
		 */
		//filterStudents();
//System.out.println(filterStudentsCount());
		
		for(Student student : filterStudentsByStart())
		{
			System.out.println(student);
		}
		
		}

	}


