package com.nr.batch1.java.exercise.pp1.threading.exercise2;

public class LeftRightPrint {

	Boolean flag=true;
	public void print(boolean isLeft) throws InterruptedException {
		
        flag=isLeft;
		System.out.println(Thread.currentThread().getName());
		if (isLeft) {
			printLeft();
		} else {
			printRight();
		}
	}

	public void printLeft() throws InterruptedException {
               // Locking System.  on Current Object
			System.out.println("Print left");
	}

	public void printRight() throws InterruptedException {
		
			System.out.println("Print Right");
	}
}
