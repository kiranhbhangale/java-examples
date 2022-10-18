package com.java8.streams;
import java.util.Arrays;

public class StreamFindAverage {
    public static void main(String[] args) {
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}