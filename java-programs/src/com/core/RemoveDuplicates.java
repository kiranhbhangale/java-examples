package com.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Simple Java program
 */

// A Java program begins with a call to main()

public class RemoveDuplicates {
	public static void main(String[] args) {
		String[] strings = new String[] {"A", "B", "A"};
		
		System.out.println("strings size => " + strings.length);
		
		Set<String> set = new HashSet(Arrays.asList(strings));
		
		System.out.println("Set size => " + set.size());
		
		System.out.println("Set  => " + set);
	}
}