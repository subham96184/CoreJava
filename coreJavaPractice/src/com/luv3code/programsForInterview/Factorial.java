package com.luv3code.programsForInterview;

import java.util.Scanner;

public class Factorial {

	public static void main(String [] args)
	{
		int fact=1;
		
		System.out.println("enter any number which u want \n");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		for(int i=1;i<=num;i++ )
		{
			fact=fact*i;
		}
		System.out.println("factorial number is : " +fact);
	}
}
