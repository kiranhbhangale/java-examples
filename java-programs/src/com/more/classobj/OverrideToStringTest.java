package com.more.classobj;

class OverrideToString {

	@Override
	public String toString() {
		return "object";
	}
}

public class OverrideToStringTest {
	public static void main(String[] args) {

		// create an object of the Test class
		OverrideToString obj = new OverrideToString();

		// print the object
		System.out.println(obj);
	}
}