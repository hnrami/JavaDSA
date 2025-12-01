package com.meybise.thread;

public class Six_case {

	private static final Object LOCK = new Object();
	
	static class BlockedWorker extends Thread {

        public BlockedWorker(String name) {
            super(name);
        }
//        
//        t1 holds LOCK and is sleeping → TIMED_WAITING
//
//        t2 tries to enter synchronized(LOCK) but can’t → BLOCKED

		@Override
		public void run() {
			synchronized (LOCK) {

				try {
					System.out.println("run-in: "+Thread.currentThread().getName() + " = " + Thread.currentThread().getState());
					Thread.sleep(3000);
					System.out.println("run-out: "+Thread.currentThread().getName() + " = " + Thread.currentThread().getState());

				} catch (Exception e) {
				}
			}
		}
    }
	
	public static void main(String[] args) throws Exception {

        Thread t1 = new BlockedWorker("Worker-1");
        Thread t2 = new BlockedWorker("Worker-2");

        // Start first thread - it acquires LOCK
        t1.start();
        Thread.sleep(50); // ensure t1 enters synchronized(LOCK)

        // Start second thread - tries but fails to get LOCK
        t2.start();
        Thread.sleep(50); // ensure t2 tries to acquire LOCK

        System.out.println(t1.getName() + " = " + t1.getState()); // TIMED_WAITING (sleep)
        System.out.println(t2.getName() + " = " + t2.getState()); // BLOCKED
    }
}
