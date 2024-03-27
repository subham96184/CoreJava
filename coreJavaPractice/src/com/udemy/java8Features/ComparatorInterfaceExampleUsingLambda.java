package com.udemy.java8Features;

import java.util.Comparator;

public class ComparatorInterfaceExampleUsingLambda {

	public static void main(String [] args) {
		
		
		
		Comparator< Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		
		System.out.println(comparator.compare(1, 2));
		
		Comparator<Integer> comparator2=(Integer a, Integer b)->
			 a.compareTo(b);
			 
			 System.out.println(comparator2.compare(4, 4));
			 ComparatorInterfaceExampleUsingLambda dExampleUsingLambda=new ComparatorInterfaceExampleUsingLambda();
			
				
			 
}
	}

