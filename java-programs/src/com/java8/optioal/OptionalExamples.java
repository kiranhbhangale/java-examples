package com.java8.optioal;

import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {
		isPresentOptionalAPI();
		createEmptyOptionalObject();
	}

	// Returns an Optional with the specified present non-null value.
	private static void isPresentOptionalAPI() {
		Optional<String> opt = Optional.of("Java8");
		System.out.println(opt.isPresent());
	}

	// Returns an Optional with the specified present non-null value.
	private static void createEmptyOptionalObject() {
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
	}

}