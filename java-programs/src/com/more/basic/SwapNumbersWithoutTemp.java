package com.more.basic;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {

		int first = 12, second = 25;

		System.out.println("--Before Swap--");
		
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		first = first + second;
		second = first - second;
		first = first - second;

		System.out.println("\n--After Swap--");
		
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}