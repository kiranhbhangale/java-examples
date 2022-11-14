package com.coding.problems.leetcode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] index = twoSum(new int[] { 12, 7, 11, 15 }, 22);
		System.out.println("index[1] ->" + index[0] + "\nindex[2] ->" + index[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			throw new RuntimeException("Input array length must be 2 or greater than 2");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { map.get(nums[i]), i };
			} else {
				map.put(target - nums[i], i);
			}
		}

		return new int[] { 0, 0 };
	}

}
