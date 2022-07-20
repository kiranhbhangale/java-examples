package com.more.classobj;

//class is declared final
final class Immutable {

// private class members
	private final String name;
	private final int year;

	Immutable(String name, int date) {

		// class members are initialized using constructor
		this.name = name;
		this.year = date;
	}

// getter method returns the copy of class members
	public String getName() {
		return name;
	}

	public int getDate() {
		return year;
	}

}

public class ImmutableTest {
	public static void main(String[] args) {

		// create object of Immutable
		Immutable obj = new Immutable("Java", 2022);

		System.out.println("Name: " + obj.getName());
		System.out.println("Year: " + obj.getDate());
	}
}