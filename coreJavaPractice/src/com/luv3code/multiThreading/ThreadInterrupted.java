package com.luv3code.multiThreading;

class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("lazy thread");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("im interrupted");
		}

	}

}

public class ThreadInterrupted {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();
		//t.interrupt();
		System.out.println("end of main");

	}

}
