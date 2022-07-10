package com.enums;

//Use the built-in enumeration methods. 

//An enumeration of Transport varieties. 
enum Transports {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo2 {
	public static void main(String[] args) {
		Transports tp;

		System.out.println("Here are all Transport constants");

		// use values()
		Transports[] allTransports = Transports.values();
		for (Transports t : allTransports)
			System.out.println(t);

		System.out.println();

		// use valueOf()
		tp = Transports.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);

	}
}