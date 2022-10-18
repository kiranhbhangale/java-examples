package com.java8.streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamSimpleExample {
	public static void main(String[] args) throws IOException {

		Collection<String> collection = Arrays.asList("Kotlin", "Spring Boot", "Spring", "C");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

	}
}