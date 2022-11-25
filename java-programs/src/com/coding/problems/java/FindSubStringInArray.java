package com.coding.problems.java;

import java.util.StringTokenizer;

public class FindSubStringInArray {
	private static String INPUT_TEXT[] = { "Be stacng, ac account!", "Acc", "ACd" };

	public static void main(String[] args) {

		int count = 0;

		for (String str : INPUT_TEXT) {
			int occurances = countStringInString(str.toLowerCase(), "ac");
			count += occurances;
		}

		System.out.println(count);

	}

	public static int countStringInString(String element, String toFind) {

		int position = 0;
		int count = 0;
		int n = toFind.length();

		StringTokenizer tokens = new StringTokenizer(element, " ");

		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken();
			if (token.indexOf(toFind, position) != -1) {
				count++;
			}

		}

		return count;
	}

}
