package com.meybise.thread;

public class Three_case {

	public static void main(String[] args) throws Exception {

		Thread t1 = new SimpleThread();

		System.out.println("State before start = " + t1.getState()); // NEW

		t1.start(); // Thread created → RUNNABLE

		System.out.println("State after start = " + t1.getState()); // RUNNABLE

		t1.join(); // ⬅ main waits for t1 to finish

		System.out.println("State after finish = " + t1.getState()); // TERMINATED
	}

}

class SimpleThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running...");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("Thread finished.");
	}
}
