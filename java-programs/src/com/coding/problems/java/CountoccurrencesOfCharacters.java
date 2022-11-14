package com.coding.problems.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountoccurrencesOfCharacters {
	private static String INPUT_TEXT = "Be strong, be fearless!";

	public static void main(String[] args) {
		System.out.println("Input text: \n" + INPUT_TEXT + "\n");

		System.out.println("HashMap based solution:");

		Map<Character, Integer> duplicatesV1 = countDuplicateCharactersV1(INPUT_TEXT);

		System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));

	}

	public static Map<Character, Integer> countDuplicateCharactersV1(String str) {

		if (str == null || str.isBlank()) {
			return Collections.emptyMap();
		}

		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
		}

		return result;
	}

}
