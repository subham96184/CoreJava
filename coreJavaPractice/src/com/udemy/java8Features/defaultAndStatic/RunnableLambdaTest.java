package com.udemy.java8Features.defaultAndStatic;

public class RunnableLambdaTest {
	   public static void main(String[] args) {
	      
	      Runnable r2 = () -> {   // lambda expression
	         System.out.println("Runnable with Lambda Expression");
	      };
	      Thread mThread= new Thread(r2);
	      mThread.start();
	   }
	}


