package com.udemy.java8Features.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public static List<Student> getAllStudents()

	{
		
		Student student1=new Student("shan", 8, 5d, "male",Arrays.asList("swimming","selling","pot"),11);
		Student student2=new Student("neymar", 6, 4d, "male",Arrays.asList("sleeping","making you","drink"),12);
		Student student3=new Student("jr", 6, 7d, "female",Arrays.asList("cricekt","reading","zym"),3);
		Student student4=new Student("maru", 3, 89d, "male",Arrays.asList("football","nope","snoaring"),32);
		Student student5=new Student("junf", 4, 55d, "male",Arrays.asList("carroms","swimming","hate"),12);
		Student student6=new Student("nauhef", 6, 35d, "male",Arrays.asList("singing","drugs","love"),1);
		
		List<Student> list=Arrays.asList(student1,student2,student3,student4,student5,student6);
		return list;
	}
}
