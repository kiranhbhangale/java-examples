package com.java8.lambda;

public class LabmdaDemo {

	public static void main(String[] args) {

		// create thread without Lambda expression

		new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread without Lambda");
			}
		}).start();

		// create thread using Lambda Expression

		new Thread(() -> System.out.println("Thread using Lambda")).start();
		;

	}

}
