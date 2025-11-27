package com.meybise.thread;

public class ThreadMasterDemo {

	
	
	
	 // ---------------------------------------------------------
    // 1. Simple Thread by extending Thread
    // ---------------------------------------------------------
    static class SimpleThread extends Thread {
        public SimpleThread(String name) { super(name); }

        @Override
        public void run() {
            System.out.println(getName() + " -> RUNNING");
            try { Thread.sleep(200); } catch (InterruptedException e) {}
            System.out.println(getName() + " -> FINISHED");
            System.out.println("ewew");
            System.out.println("dsds");
        }
    }
    
    
 // ---------------------------------------------------------
    // 2. Demonstrate all Thread States
    // NEW → RUNNABLE → BLOCKED → WAITING → TIMED_WAITING → TERMINATED
    // ---------------------------------------------------------
    static class StateDemoThread extends Thread {
        public StateDemoThread(String name) { super(name); }

        @Override
        public void run() {
            System.out.println(getName() + " → RUNNABLE");

            synchronized (ThreadMasterDemo.class) {
                try {
                	
                	System.out.println(getName() + " → Line number 39");
                    Thread.sleep(300); // TIMED_WAITING
                } catch (Exception e) {}
            }

            // WAITING
            synchronized (ThreadMasterDemo.class) {
                try {
                	System.out.println(getName() + " → Line number 47");
                    ThreadMasterDemo.class.wait();
                } catch (Exception e) {}
            }
        }
    }
    
    // ---------------------------------------------------------
    // 3. BLOCKED - thread waiting for synchronized lock
    // ---------------------------------------------------------
    static class BlockedThread extends Thread {
        public BlockedThread(String name) { super(name); }

        @Override
        public void run() {
            synchronized (LOCK) {        // Second thread will BLOCK here
                try { Thread.sleep(400); } catch (Exception e) {}
            }
        }
    }

    private static final Object LOCK = new Object();
    
    
    // ---------------------------------------------------------
    // 4. Demonstrate sleep(), yield(), join()
    // ---------------------------------------------------------
    static class SleepYieldJoinThread extends Thread {
        public SleepYieldJoinThread(String name) { super(name); }

        @Override
        public void run() {
            System.out.println(getName() + " started");

            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " working: " + i);
                Thread.yield(); // hint to scheduler
            }

            try { Thread.sleep(300); } catch (InterruptedException e) {}

            System.out.println(getName() + " completed");
        }
    }
    
    
 // ---------------------------------------------------------
    // 5. Interruption example
    // ---------------------------------------------------------
    static class InterruptibleThread extends Thread {
        public InterruptibleThread() { super("InterruptibleThread"); }

        @Override
        public void run() {
            System.out.println(getName() + " waiting...");
            try {
                while (true) {
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted!");
            }
        }
    }
    
 // ---------------------------------------------------------
    // 6. Daemon thread example
    // ---------------------------------------------------------
    static class DaemonWorker extends Thread {
        public DaemonWorker() { super("DaemonWorker"); }

        @Override
        public void run() {
            while (true) {
                System.out.println("Daemon running...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
            }
        }
    }
    
    
    
	 public static void main(String[] args) throws Exception {

			System.out.println("\n=== 1. SIMPLE THREAD ===");
			// Nothing is running yet. Thread is in NEW state.
			Thread t1 = new SimpleThread("SimpleThread-1");
			
			// Then two things happen:

			//✔️ JVM creates a new OS-level thread.
            //✔️ JVM calls your thread’s run() method in that new thread.
			
			//Main Thread  ---- executes your main() method
			// SimpleThread ---- executes run() in parallel
			t1.start();
			
			//join() makes the current thread (main thread) wait until t1 finishes.
			//main thread stops and waits
			//t1 thread runs its run() method
			//once t1 finishes → main thread continues
			t1.join();
			
			System.out.println("Main done!");

	        System.out.println("\n=== 2. THREAD STATE LIFECYCLE ===");
	        StateDemoThread sd = new StateDemoThread("StateThread");
	        System.out.println("State before start Line Number 148= " + sd.getState()); // NEW
	        sd.start();
	        Thread.sleep(40);
	        System.out.println("State after start  Line Number 151 = " + sd.getState());  // RUNNABLE / TIMED_WAITING

	        // Wake up StateThread after some time
	        Thread.sleep(350);
	        synchronized (ThreadMasterDemo.class) {
	        	ThreadMasterDemo.class.notifyAll();
	        	System.out.println("State after start  Line Number 157 = " + sd.getState());
	        }
	        sd.join();
	        System.out.println("State after finish 165 = " + sd.getState()); // TERMINATED
////
	        System.out.println("\n=== 3. BLOCKED DEMO ===");
	        Thread block1 = new BlockedThread("Blocker-1");
	        Thread block2 = new BlockedThread("Blocker-2");

	        synchronized (LOCK) { // HOLD LOCK so next thread becomes BLOCKED
	            block1.start();
	            Thread.sleep(50);
	            block2.start();

	            System.out.println("Blocker-1 state = " + block1.getState());
	            System.out.println("Blocker-2 state = " + block2.getState()); // BLOCKED
	        }
	        
	        block1.join();
	      
	        block2.join();

	        System.out.println("\n=== 4. SLEEP, YIELD, JOIN DEMO ===");
	        SleepYieldJoinThread sj1 = new SleepYieldJoinThread("Worker-1");
	        SleepYieldJoinThread sj2 = new SleepYieldJoinThread("Worker-2");
	        sj1.start();
	        sj2.start();

	        sj1.join();
	        sj2.join();

	        System.out.println("\n=== 5. INTERRUPT DEMO ===");
	        InterruptibleThread it = new InterruptibleThread();
	        it.start();
	        Thread.sleep(300);
	        it.interrupt();
	        it.join();

	        System.out.println("\n=== 6. DAEMON THREAD ===");
	        DaemonWorker dw = new DaemonWorker();
	        dw.setDaemon(true); // IMPORTANT
	        dw.start();
//
	        System.out.println("Main thread exiting. Daemon will not stop the JVM...");
	    }
}
