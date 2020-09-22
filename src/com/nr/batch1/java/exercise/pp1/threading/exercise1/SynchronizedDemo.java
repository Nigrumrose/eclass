package com.nr.batch1.java.exercise.pp1.threading.exercise1;

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Yuraj");
		MyThread t2 = new MyThread(d, "Dhoni");
		t1.start();
		t2.start();
	}
}
