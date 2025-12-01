package com.meybise.thread;




//Runnable is preferred in industry because it separates:
//
//	Task logic (run method)
//	
//	Thread execution (Thread class)

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}

public class Second_case {
    public static void main(String[] args) {
//        Thread t = new Thread(new MyTask());
//        t.start();
        
        
        Thread t = new MyThread();

        t.run();   // NOT multithreading → no new thread
        t.start(); // YES multithreading → new thread created

    }
}
