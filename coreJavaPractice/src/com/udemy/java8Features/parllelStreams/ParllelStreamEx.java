package com.udemy.java8Features.parllelStreams;

import java.util.stream.IntStream;

public class ParllelStreamEx {

	public static int sum_sequ() {
		
		return IntStream.rangeClosed(1,10 ).sum();

	}
	public static int sum_Parllel_sequ() {
		
		return IntStream.rangeClosed(1,1000 ).parallel().sum();

	}	
	public static void main(String[] args) {
		
	System.out.println(	sum_Parllel_sequ());
	System.out.println(	sum_sequ());	
	//sum_sequ();

	}

}
