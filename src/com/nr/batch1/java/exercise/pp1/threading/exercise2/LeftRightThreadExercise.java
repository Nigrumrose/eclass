package com.nr.batch1.java.exercise.pp1.threading.exercise2;

public class LeftRightThreadExercise {

	/*
	 * Communications between two threads with synchronized method
	 * wait and notify methods compulsorly used in synchronized block otherwise illegle monitor exception
	 */
	public static void main(String[] args) {

		LeftRightPrint leftRightPrint=new LeftRightPrint();
		Thread t1=new Thread(new Thread1(leftRightPrint));
		t1.start();
		Thread t2=new Thread(new Thread1(leftRightPrint));
		t2.start();
	}
}
