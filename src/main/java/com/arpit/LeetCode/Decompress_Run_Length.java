package com.arpit.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Decompress_Run_Length {

	/*
	 * Input: nums = [1,2,3,4] Output: [2,4,4,4] Explanation: The first pair [1,2]
	 * means we have freq = 1 and val = 2 so we generate the array [2]. The second
	 * pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4]. At the
	 * end the concatenation [2] + [4,4,4,4] is [2,4,4,4].
	 */

	public static void main(String[] args) {
		int[] output = decompressRLElist(new int[] { 1, 2, 10, 4 });
		for (var i : output) {
			System.out.print(i);
		}
	}

	public static int[] decompressRLElist(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i = i + 2) {
			int temp = nums[i];
			while (temp-- > 0) {
				list.add(nums[i + 1]);
			}

		}
		return list.stream().mapToInt(i -> i).toArray();		//takes loner time than below code
//		int[] return_value = new int[list.size()];
//		for (int i = 0; i < list.size(); i++)
//			return_value[i] = list.get(i);
//		return return_value;
	}
}
