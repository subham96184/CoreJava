package com.udemy.java8Features.defaultAndStatic;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.udemy.java8Features.data.Student;
import com.udemy.java8Features.data.StudentDatabase;

public class DefaultMethodExample2 {

	static 	List<Student> studentList=	StudentDatabase.getAllStudents();
	static Consumer<Student> consumer=(student->System.out.println(student));
	static  Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
    static 	   Comparator<Student> gpaComparator=Comparator.comparingDouble(Student::getGpa);
    static 	   Comparator<Student> gpaComparator1=Comparator.comparing(Student::getGpa);
    
   static	public void sortByName(List<Student> students)
   {
	   System.out.println("after sort by name");
	  
	   students.sort(nameComparator);
	   students.forEach(consumer);
   }
   
   static	public void sortByGpa(List<Student> students)
   {
	   System.out.println("after sort by gpa");

	   students.sort(gpaComparator1);
	   students.forEach(consumer);
   }
   
   public static void comparatorChaining() {
	   System.out.println("after chaining");
	studentList.sort(gpaComparator.thenComparing(nameComparator));
	studentList.forEach(consumer);
	   
}
	
	public static void main(String[] args) {
		

	//System.out.println(studentList);
	
	System.out.println("befor start");
	studentList.forEach(consumer);
	sortByName(studentList);
	sortByGpa(studentList);
	comparatorChaining();
	
	}
}
