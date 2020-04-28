package com.arpit.LeetCode.Top.Interview.Ques.Easy;

public class Remove_Duplicates_from_Sorted_Array {

	/* Given nums = [0,0,1,1,1,2,2,3,3,4],
	 * Your function should return length = 5, with the first five elements of nums 
	 * being modified to 0, 1, 2, 3, and 4 respectively.
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 0, 0, 0, 1, 2, 2, 3, 4 };
		int len = removeDuplicates(nums);

		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}

	}

	private static int removeDuplicates(int[] nums) {
		int lastIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[lastIndex]) {
				nums[++lastIndex] = nums[i];
			}
		}
		return lastIndex + 1;
	}

}
