package com.luv3code.programsForInterview;

class Student
{
String name;
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + "]";
}
int rollno;
Student(String name,int rollno) //Constructor
{
this.name=name;
this.rollno=rollno;
}
public static void main(String[] args)
{
Student s1=new Student("vijayabhaskar",101);
Student s2=new Student("bhaskar",102);
System.out.println(s1.toString());
}
}