package com.udemy.java8Features;

import java.util.stream.IntStream;

public class ImperativeAndDeclarative {

	public static void main(String[] args) {
		// how style of programming
		
		int sum=0;
		for(int i=0;i<=100;i++)
		{
		   sum=sum+i;
		}
		System.out.println(sum);

		
		// declerative 
		
     int sum1=		IntStream.rangeClosed(0, 100).parallel().sum();
     System.out.println(sum1);
	}

}
