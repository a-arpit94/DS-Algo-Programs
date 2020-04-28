package com.arpit.LeetCode.Top.Interview.Ques.Easy;

public class Single_Number {

	/*
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Input: [2,2,1] Output: 1
	 */

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 1, 4, 1};
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a ^= i;
		}
		return a;
	}

}
