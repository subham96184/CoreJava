package com.luv3code.multiThreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		Future<Integer> future = service.submit(new Test());
		service.submit(new Test2());
		try {
			Integer integer = future.get();
			System.out.println(integer);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Test implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		
		return new Random().nextInt();
	}
	}
class Test2 implements Runnable
{

	@Override
	public void run() {
		System.out.println("dd");
		
	}
	}