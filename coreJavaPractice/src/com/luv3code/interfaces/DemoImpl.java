package com.luv3code.interfaces;

public class DemoImpl implements Demo{

	public static void main(String [] args)
	{
		//DemoImpl impl=new DemoImpl();
		Demo impl=new DemoImpl();
		impl.m1();
	}

	@Override
	public void m1() {
		System.out.println("implementation for demo..");
		
	}
}
