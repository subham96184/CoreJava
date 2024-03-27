package com.luv3code.java8Features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class ConsumerDemo {
	
	
public static void main(String[] args) {
	
	
	  Consumer<Integer> consumer=(t)->System.out.println("printing "+t);
	  consumer.accept(10);
	 

	List<Integer> list=Arrays.asList(1,2,3,5,6);
	list.forEach(t->System.out.println(t));
//	list.forEach(t->System.out.println("print :"+t));
//	list.forEach(t->System.out.println(t));
}
	
}
