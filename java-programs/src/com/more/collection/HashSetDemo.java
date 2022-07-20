package com.more.collection;

import java.util.Set;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		// Creating an set
		Set<String> languages = new HashSet<>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		System.out.println("Set: " + languages);
		
		System.out.println("\n");

		// Using forEach loop
		System.out.println("Iterating over Set using for-each loop:");
		for (String language : languages) {
			System.out.print(language);
			System.out.print(", ");
		}
		
		System.out.println("\n");
		
		// Creating an instance of Iterator
	    Iterator<String> iterate = languages.iterator();
	    System.out.println("Iterating over Set:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
		
		System.out.println("\n");
		
		// iterate each element of the set
	    System.out.print("Element of Set: ");

	    // access each element using forEach() method
	    // pass lambda expression to forEach()
	    languages.forEach((e) -> {
	      System.out.print(e + " ");
	    });
	}
}