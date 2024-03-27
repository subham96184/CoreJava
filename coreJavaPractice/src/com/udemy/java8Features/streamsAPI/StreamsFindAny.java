package com.udemy.java8Features.streamsAPI;

import java.util.Optional;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamsFindAny {

	public static Optional<Student> findAnyStudent(){
    		return StudentDatabase.getAllStudents()
    				.stream()
    				.filter(student->student.getGpa()>=5)
    				.findAny();
	}
	public static Optional<Student> findFirstStudent(){
		return StudentDatabase.getAllStudents()
				.stream()
				.filter(student->student.getGpa()>=6)
				.findFirst();
}

	public static void main(String[] args) {
		Optional<Student> stOptional=findAnyStudent();
		if (stOptional.isPresent()) {
			System.out.println(stOptional.get());
		}
		else {
			System.out.println("nope");
		}
		System.out.println(findFirstStudent());
	}

}
