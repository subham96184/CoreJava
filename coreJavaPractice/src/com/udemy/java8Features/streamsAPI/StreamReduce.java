package com.udemy.java8Features.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamReduce {

	public static int peformMultiplication(List<Integer> list) {
		return list.stream().reduce(2, (a, b) -> a * b);
	}

	public static Optional<Student> getHighestGpa() {
		return StudentDatabase.getAllStudents().stream().reduce((s1, s2) -> {
			if (s1.getGpa() > s2.getGpa()) {
				return s1;

			} else {
				return s2;
			}
		});
	}
	
	public static Optional<Student> getHighestGrade() {
		return StudentDatabase.getAllStudents().stream().reduce((s1, s2)->
		{
			if (s1.getGrade()>s2.getGrade()) {
				return s1;
			}else {
				return s2;
			}
		});
	}
	
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 3, 5, 6);
		System.out.println(peformMultiplication(integers));

		// Optional<Student> studeentOptional=getHighestGpa();
		// System.out.println(studeentOptional);

		if (getHighestGpa().isPresent()) {
			System.out.println(getHighestGpa().get());
		}
		Optional<Student> highestGrade = getHighestGrade();
		System.out.println(highestGrade);
	}

}
