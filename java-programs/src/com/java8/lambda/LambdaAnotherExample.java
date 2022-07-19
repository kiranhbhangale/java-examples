package com.java8.lambda;

interface ISound {
	public void sound();
}

public class LambdaAnotherExample {
	public static void main(String[] args) {
		// without lambda ISound implementation using anonymous class
		ISound withoutLambda = new ISound() {
			public void sound() {
				System.out.println("sing");
			}
		};
		withoutLambda.sound();

		// with lambda
		ISound withLambda = () -> {
			System.out.println("shout");
		};
		withLambda.sound();
	}
}