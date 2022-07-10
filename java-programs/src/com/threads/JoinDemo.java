package com.threads;

//Use join().

class MyThread_3 implements Runnable {
	Thread thrd;

// Construct a new thread.
	MyThread_3(String name) {
		thrd = new Thread(this, name);
	}

// A factory method that creates and starts a thread.
	public static MyThread_3 createAndStart(String name) {
		MyThread_3 myThrd = new MyThread_3(name);

		myThrd.thrd.start(); // start the thread
		return myThrd;
	}

// Entry point of thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("Main thread starting.");

		MyThread_3 mt1 = MyThread_3.createAndStart("Child #1");
		MyThread_3 mt2 = MyThread_3.createAndStart("Child #2");
		MyThread_3 mt3 = MyThread_3.createAndStart("Child #3");

		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}
}
