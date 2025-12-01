package com.meybise.thread;

public class Five_case {

	 public static void main(String[] args) throws Exception {

	        WaitThread t = new WaitThread();
	        t.start();

	        Thread.sleep(100); // give thread time to call wait()

	        System.out.println("State = &&&&&&&&&&&& " + t.getState() + Thread.currentThread().getName()); // WAITING

	        synchronized (t) {
	           t.notify(); // wake it
	            System.out.println("main-out :::::"+Thread.currentThread().getName()); 
	        }

	        t.join();
	    }
}

class WaitThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            try {
            	System.out.println("run-in ************"+Thread.currentThread().getName()); 
                this.wait(); // WAITING
            	System.out.println("run-out ###################3"+Thread.currentThread().getName()); 
            } catch (Exception e) {}
        }
    }
}
