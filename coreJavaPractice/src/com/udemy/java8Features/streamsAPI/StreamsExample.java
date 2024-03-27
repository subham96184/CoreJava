package com.udemy.java8Features.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> studetnPredicate=student->student.getGrade()>=6;
		Map<String, List<String>> studentMap= StudentDatabase.getAllStudents()
				.stream()
				.peek((students->System.out.println(students)))
				
				.filter(studetnPredicate)
				.collect(Collectors
						.toMap(Student::getName,Student::getActivities));

		System.out.println(studentMap);
	}

}
