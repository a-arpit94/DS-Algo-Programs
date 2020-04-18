package com.arpit.LeetCode;

public class Even_Digits {

	/*
	 * Input: nums = [12,345,2,6,7896] Output: 2 Explanation: 12 contains 2 digits
	 * (even number of digits). 345 contains 3 digits (odd number of digits). 2
	 * contains 1 digit (odd number of digits). 6 contains 1 digit (odd number of
	 * digits). 7896 contains 4 digits (even number of digits). Therefore only 12
	 * and 7896 contain an even number of digits.
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(arr));

	}

	public static int findNumbers(int[] nums) {
		int tot_cnt = 0, c;
		for (int i : nums) {
			c = 0;
			while (i > 0) {
				c++;
				i /= 10;
			}
			if (c % 2 == 0)
				tot_cnt++;
		}
		return tot_cnt;
	}

}
