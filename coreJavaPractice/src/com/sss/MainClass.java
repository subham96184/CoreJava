package com.sss;

public class MainClass {
	public static void main(String[] args) {
		
		Im tesIm=new Im();
		tesIm.mq();
		I obj = new Im();
		obj.mq();
	}

}

interface I {
	public void mq();

}

class Im implements I {

	@Override
	public void mq() {
		System.out.println("ss");

	}
}
