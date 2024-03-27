package com.udemy.java8Features;

import java.util.List;
import java.util.function.Predicate;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class PredicateStudentExample {

	static Predicate<Student> p1=(s)->s.getGrade()>=8;
	
	public static void filterByGrade()
	{
		List<Student> sList=StudentDatabase.getAllStudents();
		sList.forEach((s)->{
			if(p1.test(s))
			{
				System.out.println(s);
				
			}
		});
	}
	
	public static void main(String[] args) {

		filterByGrade();
	}
}
