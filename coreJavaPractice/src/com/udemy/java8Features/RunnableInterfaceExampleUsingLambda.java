package com.udemy.java8Features;

public class RunnableInterfaceExampleUsingLambda {

	public static void main(String [] args) {
		
		// 
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
			System.out.println("inside runrable interface");				
			}
		};
		
		Thread myThread=new Thread(runnable);
		myThread.start();
		
		Runnable runnableLambda= ()->{
			System.out.println("inside runnable Lambda interface");
		};
		
		new Thread(runnableLambda).start();
		
		new Thread(()->System.out.println("inside runnable ")).start();
}
}

