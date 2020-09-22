package com.nr.batch1.java.exercise.pp1.threading.exercise2;

public class Thread1 implements Runnable {
	LeftRightPrint leftRightPrintObj;

	public Thread1(LeftRightPrint leftRightPrintObj) {
		this.leftRightPrintObj = leftRightPrintObj;
	}

	@Override
	public void run() {

		boolean b = true;

		for (int i = 0; i < 10; i++) {
			synchronized (leftRightPrintObj) {
				try {
					leftRightPrintObj.wait(500);
					leftRightPrintObj.print(leftRightPrintObj.flag = !leftRightPrintObj.flag);

				} catch (Exception e) {
					e.printStackTrace();
				}
				leftRightPrintObj.notifyAll();
			}
		}

	}
}
