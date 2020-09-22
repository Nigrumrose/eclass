package com.nr.batch1.java.exercise.pp1.threading.exercise1;

public class Display {

	public synchronized void wish(String name) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Good Morning");
				try {
					//Thread.sleep(1000);
					wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				notify();
				System.out.println(name);
			}
		}
	}
}
