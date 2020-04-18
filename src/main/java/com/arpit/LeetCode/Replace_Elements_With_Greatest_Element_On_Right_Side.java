package com.arpit.LeetCode;

public class Replace_Elements_With_Greatest_Element_On_Right_Side {

	/*
	 * Input: arr = [17,18,5,4,6,1] 
	 * Output: [18,6,6,6,1,-1]
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 17, 18, 5, 4, 6, 1 };
		for (int i : replaceElements(arr))
			System.out.print(i + " ");
	}

	public static int[] replaceElements(int[] arr) {
		int max = arr[arr.length - 1];
		int currMax;
		arr[arr.length - 1] = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			currMax = arr[i];
			arr[i] = max;
			if (max < currMax)
				max = currMax;
		}
		return arr;
	}
}