package com.udemy.java8Features;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate=(i)->{
			return i%2==0;
		};
//System.out.println(predicate.test(5));

Predicate<Integer> predicate1=(i)-> i%2==0;
Predicate<Integer> predicate2=(i)-> i%6==0;
System.out.println(predicate1.and(predicate2).test(10));
System.out.println(predicate1.and(predicate2).test(12));
System.out.println(predicate1.or(predicate2).test(12));
	}
}
