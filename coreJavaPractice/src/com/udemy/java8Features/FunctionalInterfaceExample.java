package com.udemy.java8Features;

import java.util.List;
import java.util.function.Consumer;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class FunctionalInterfaceExample {
	static 	List<Student> studentsList=	StudentDatabase.getAllStudents();
	static Consumer<Student> c3=s->System.out.print(s.getName());
	static Consumer<Student> c4=s->System.out.println(s.getActivities());
	
	public static void printName()
	{
		Consumer<Student> c2=(s)->System.out.println(s);
		/*
	 * for(Student student:studentsList) { System.out.println(student); }
	 */
	
	studentsList.forEach(t->System.out.println(c2));
	
	}

	public static void printNameActivities()
	{
		Consumer<Student> c3=s->System.out.print(s.getName());
		Consumer<Student> c4=s->System.out.println(s.getActivities());
		studentsList.forEach(c3.andThen(c4));
		
	}
	public static void printNameActivitiesUsingCondition()
	{
		
		studentsList.forEach((s)->
		{
			if(s.getGpa()>=8)
			{
				c3.andThen(c4).accept(s);
			}
		});		
	}
	public static void main(String[] args) {
		
		Consumer< String> consumer=(s)->System.out.println(s.toUpperCase());
		consumer.accept("johnny bhai");
		//printName();
		//printNameActivities();
		printNameActivitiesUsingCondition();
	}
}
