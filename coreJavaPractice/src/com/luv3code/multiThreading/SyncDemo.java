package com.luv3code.multiThreading;



class Display {
	
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);

		}
		synchronized(this) {
			
		}
	}
	
}

class MyThreads extends Thread {
	Display display;
	String name;

	public MyThreads(Display display, String name) {

		this.display = display;
		this.name = name;
	}

	 public void run()
	 {
		 display.wish(name);
	 }
}
public class SyncDemo {

	public static void main(String[] args) {
		Display display=new Display();
		MyThreads thread=new MyThreads(display, "subham");
		MyThreads thread2=new MyThreads(display, "achary");		
		thread.start();
		thread2.start();

	}

}