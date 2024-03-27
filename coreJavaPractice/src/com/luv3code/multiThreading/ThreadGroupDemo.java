package com.luv3code.multiThreading;

class MyThread4 extends Thread {
	MyThread4(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}
}

class ThreadGroupDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThread4 t1 = new MyThread4(pg, "Child Thread 1");
		MyThread4 t2 = new MyThread4(pg, "Child Thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		 pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
	}
}