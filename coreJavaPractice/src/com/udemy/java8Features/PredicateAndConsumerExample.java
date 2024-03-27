package com.udemy.java8Features;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1=(s)->s.getGrade()>4;
	Predicate<Student> p2=(s)->s.getGpa()>4;
	BiConsumer< String, List<String>> biConsumer=(name,activities)->
	System.out.println("name : " +name+ " activities: " +activities);
	Consumer<Student> studentConsumer=(student->{
		
		if(p1.and(p2).test(student))
		{
			biConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	public void printNameAndActivity(List<Student> students)
	{
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
	
		List<Student> studentList=StudentDatabase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivity(studentList);
	}

}
