package com.luv3code.multiThreading;

public class ThreadGrp {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup tGroup=new ThreadGroup("sbu");
		System.out.println(tGroup.getParent().getName());
		ThreadGroup cGroup=new ThreadGroup(tGroup,"child Thread group");
		
	}
}
