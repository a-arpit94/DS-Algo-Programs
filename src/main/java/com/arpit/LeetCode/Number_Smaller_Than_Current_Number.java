package com.arpit.LeetCode;

public class Number_Smaller_Than_Current_Number {

	/*
	 * Input: nums = [8,1,2,2,3] Output: [4,0,1,1,3] Explanation: For nums[0]=8
	 * there exist four smaller numbers than it (1, 2, 2 and 3). For nums[1]=1 does
	 * not exist any smaller number than it. For nums[2]=2 there exist one smaller
	 * number than it (1). For nums[3]=2 there exist one smaller number than it (1).
	 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
	 */

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 1, 2, 2, 3,0 };
		for (int i : smallerNumbersThanCurrent(arr)) {
			System.out.print(i + " ");
		}
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] allNum = new int[101];
		
		for (int i = 0; i < nums.length; i++)
			allNum[nums[i]]++;

		for(int i = 1; i < 100; i++)
			allNum[i] +=allNum[i-1];		
		
		for(int i = 0 ; i< nums.length; i++)
		{		if(nums[i] == 0)
				nums[i] = 0;
			else
			nums[i] = allNum[nums[i]-1];
		}
		
		return nums;
	}
}
