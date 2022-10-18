package com.java8.streams;

import java.io.IOException;
import java.util.stream.Stream;

public class UsingStreamOf {
    public static void main(String[] args) throws IOException {
        Stream.of("Aoo", "Foo", "Zoo")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);
    }
}