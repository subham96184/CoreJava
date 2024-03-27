package com.luv3code.interfaces;

public class Test {

	public static void main(String[] args) {
		int a=10;
		SquareR m= (res)->a*a;
		int ss= m.math(a);
		System.out.println(ss);
	}

}

interface SquareR
{
	int math(int s);
	}