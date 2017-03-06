package com.kyj.base.test;

public class RunThread {
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			//实现runable
			/*Thread thread = new Thread(new RunableTest());
			thread.start();*/
			//继承thread
			Thread thread = new Thread(new ThreadTest());
			thread.start();
		}
	}
}
