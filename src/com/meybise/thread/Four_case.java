package com.meybise.thread;

public class Four_case {

	public static void main(String[] args) throws Exception {

		Thread t = new SleepThread();
		t.start();

		Thread.sleep(100); // give thread time to enter sleep

		System.out.println("State = " + t.getState()); // TIMED_WAITING
	}
}

class SleepThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run-in");
			//Because Thread.sleep(2000) makes thread sleep for fixed time.
			Thread.sleep(2000); // 2 seconds
			System.out.println("run-out");
		} catch (Exception e) {
		}
	}
}