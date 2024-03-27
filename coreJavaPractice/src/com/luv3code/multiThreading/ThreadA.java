package com.luv3code.multiThreading;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		// Thread.sleep(1000);
		synchronized (b) {
			System.out.println("main thread trying to call wait method");
			b.wait();
			System.out.println("mainn thread got notification");

			System.out.println("total: " + b.total);
		}

	}

}

class ThreadB extends Thread {

	int total = 0;
	ThreadB threadB;

	public void run() {
		synchronized (this) {

			System.out.println("child thread starts calculation");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread trying tp give notification");
			this.notify();

		}
	}

}
