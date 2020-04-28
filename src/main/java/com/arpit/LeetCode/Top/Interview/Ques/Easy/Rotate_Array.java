package com.arpit.LeetCode.Top.Interview.Ques.Easy;

public class Rotate_Array {

	/*
	 * Given an array, rotate the array to the right by k steps, where k is
	 * non-negative.
	 * 
	 * Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4] Explanation: rotate
	 * 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
	 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 3);
		for (var i : arr)
			System.out.print(i);
		
		System.out.println();
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BetterRotate(arr1, 14);
		for (var i : arr1)
			System.out.print(i);
	}

	public static void rotate(int[] nums, int k) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			arr[i] = nums[i];
		k = k % arr.length;
		int j = -1;
		for (int i = arr.length - k; i < arr.length; i++)
			nums[++j] = arr[i];
		for (int i = 0; i < arr.length - k; i++)
			nums[++j] = arr[i];
	}

	public static void BetterRotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);

	}
	
	private static void reverse(int[] input, int start, int end) {
		while(start<end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
	}


}
