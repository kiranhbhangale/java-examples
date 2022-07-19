package com.java8.lambda;

interface IMove {

	void move(String speed);
}

public class LambdaWithOneParameter {

	public static void main(String[] args) {
		
		// without lambda expression
		
		IMove movable = new IMove() {
			@Override
			public void move(String speed) {
				System.out.println(speed);
			}
		};
		movable.move("Slow....");
		
		// with lambda expression
		IMove withLambda = (speed) -> System.out.println(speed + "!!!!");
		withLambda.move("Fast");
	}
	
}