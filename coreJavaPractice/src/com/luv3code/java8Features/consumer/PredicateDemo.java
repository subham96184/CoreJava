package com.luv3code.java8Features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {/*implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		if(t%2==0)
		{
			return true;
		}
		else {
			return false;
		}
	}*/
	
	public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicate= (t)->t%2==1;
		 * System.out.println(predicate.test(10));
		 */
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("print even: "+t));
	}

}
