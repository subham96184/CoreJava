package com.udemy.java8Features.streamsAPI;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class StreamMapReduce {

	private static int noONoteBooks() {
		return StudentDatabase.getAllStudents().stream().filter(student -> student.getGender().equals("female"))
				.map(Student::getNotebook)
				// .reduce(0,(a,b)->a+b);
				.reduce(0, Integer::sum);
	}

	private static List<String> BooksList() {
		return StudentDatabase.getAllStudents().stream()
				// .filter(student->student.getGender().equals("female"))
				.map(Student::getGender).collect(Collectors.toList());
		// .reduce(0,(a,b)->a+b);
		// .reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("no of notebooks: " + noONoteBooks());
		
		 //List<String> booksList = BooksList();
		 //System.out.println(booksList);
		for (String string : BooksList()) {
			System.out.println(string);
		}  
	}

}
