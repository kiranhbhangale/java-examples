package com.java8.lambda;

interface Operable {
	int operation(int a, int b);
}

class OperableImp implements Operable {

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class LambdaMultipleParameters {

	public static void main(String[] args) {
		
		Operable op = new OperableImp();
		op.operation(1, 5);

		// without lambda expression
		Operable withoutLambdaAdd = new Operable() {
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("a + b = " + withoutLambdaAdd.operation(10, 2));

		// with lambda expression
		
		// Multiple parameters in lambda expression subtraction
		Operable withLambdaSubtract = (a, b) -> (a - b);
		System.out.println("a - b = " + withLambdaSubtract.operation(10, 2));

		// Multiple parameters with data type in lambda expression multiplication
		Operable withLambdaMultiply = (int a, int b) -> (a * b);
		System.out.println("a * b = " + withLambdaMultiply.operation(100, 2));
		
		// Multiple parameters with data type in lambda expression multiplication
		Operable withLambdaDivide = (int a, int b) -> { return (a / b); };
		System.out.println("a / b = " + withLambdaDivide.operation(100, 2));
	}

}