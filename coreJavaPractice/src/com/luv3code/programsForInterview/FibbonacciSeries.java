package com.luv3code.programsForInterview;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=1;
		int temp=1;
		System.out.println("enter max number for fibonnacci");
		int max=new Scanner(System.in).nextInt();
		
		System.out.print(num1 +""+num2);
		for (int i=1;i<max;i++)
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(temp);
		}

	}

}
