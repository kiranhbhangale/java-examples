package com.more.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Creating an array list
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		System.out.println("ArrayList: " + languages);
		
		System.out.println("\n");
		
		// Using for loop
		System.out.println("Iterating over ArrayList using for loop: ");

		for (int i = 0; i < languages.size(); i++) {
			System.out.print(languages.get(i));
			System.out.print(", ");
		}
		
		System.out.println("\n");
		
		 // Using forEach loop
	    System.out.println("Iterating over ArrayList using for-each loop:");
	    for(String language : languages) {
	      System.out.print(language);
	      System.out.print(", ");
	    }
	    
	    System.out.println("\n");
	    
	 // Creating an instance of ListIterator
	    ListIterator<String> iterate = languages.listIterator();
	    System.out.println("Iterating over ArrayList using ListIterator:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
	}
}