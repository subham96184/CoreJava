package com.luv3code.multiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableFutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service=Executors.newFixedThreadPool(10);
		Future<List<Integer>> future = service.submit(()->{
			System.out.println(" Thread :"+Thread.currentThread().getName());
			Thread.sleep(4000);
			return Arrays.asList(1,2,4,5,4);
		});
		Future<String> future2 = service.submit(new  MyCalD());
		
		String string = future2.get();
		System.out.println(string);
		
		Future<String> future3 = service.submit(()->{
			return "ss";
		});
		CompletableFuture<String> completableFuture=new CompletableFuture<>();
		completableFuture.get();
		completableFuture.complete("return some data without blocking main thread");
		
		
		List<Integer> list = future.get();
		System.out.println(list);

	}
}

class MyCalD implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "subham";
	}
}