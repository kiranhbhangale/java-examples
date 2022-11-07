package com.more.basic;

class FarthestFromZero {

	public static void main(String[] args) {
		int array[] = { 1, 2, 4, 5, 8 };

		System.out.println("Farthest from zero = " + farthestFromZero(array));
	}

	public static int farthestFromZero(int[] arr) {
		int left, right, max;
		left = right = max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				right = Math.max(right, arr[i]);
			} else {
				left = Math.min(left, arr[i]);
			}
		}

		if (Math.abs(left) >= Math.abs(right)) {
			max = left;
		} else {
			max = right;
		}
		return max;
	}
}