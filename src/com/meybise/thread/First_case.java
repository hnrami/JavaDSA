package com.meybise.thread;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class First_case {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();   // Important!
    }
}
