package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> morningRoutine = new LinkedList<>();

		if (!morningRoutine.isEmpty()) {
			System.out.println("The first element of the list: " + morningRoutine.getFirst());
		}

		if (!morningRoutine.isEmpty() && morningRoutine.peekFirst() != null) {
			System.out.println("The first element of the list: " + morningRoutine.peekFirst().toUpperCase());
		}

		morningRoutine.add("Brushing my teeth");
		morningRoutine.addFirst("Taking the dog for a walk");
		morningRoutine.push("Doing 32 push-ups");
		morningRoutine.offer("Reading 1 chapter of a book");

		System.out.println(morningRoutine);

		System.out.println("I completed the first element on my list: " + morningRoutine.pollFirst());
		System.out.println("I completed the last element on my list: " + morningRoutine.pollLast());

		System.out.println(morningRoutine);

	}
}