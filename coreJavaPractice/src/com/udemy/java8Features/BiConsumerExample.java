package com.udemy.java8Features;

import java.util.List;
import java.util.function.BiConsumer;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class BiConsumerExample {

	public static void nameAndActivities()
	{
		BiConsumer<String, List<String>> biConsumer=(name,activities)->
		System.out.println("name : "+name +"activities : " +activities);
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach((student->biConsumer.accept(student.getName(), student.getActivities())));
		
	}
	public static void main(String[] args) {
		
		BiConsumer< String, String> biConsumer=(a,b)->{
			System.out.println("a : " +a+ "b : "+b);
		};

		biConsumer.accept("hey", "alexa");
		
		BiConsumer<Integer, Integer> mult=( a,  b)->{
			System.out.println("multiply : "+a*b);
		};
		
		BiConsumer<Integer, Integer> div=( a,  b)->{
			System.out.println("div : "+ (a/b));
		};
		mult.andThen(div).accept(6, 7);
		nameAndActivities();
	}

}
