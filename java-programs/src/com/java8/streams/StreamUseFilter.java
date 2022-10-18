package com.java8.streams;
import java.io.IOException;
import java.util.Arrays;

public class StreamUseFilter {
    public static void main(String[] args) throws IOException {
        String[] names = {"Amit", "Ankit", "Krunal", "Rahul", "Sarika", "Neha", "Lakshman", "Shiva", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}