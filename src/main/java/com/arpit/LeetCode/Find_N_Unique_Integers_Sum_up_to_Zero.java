package com.arpit.LeetCode;

public class Find_N_Unique_Integers_Sum_up_to_Zero {

	/*
	 * Input: n = 5 
	 * Output: [-7,-1,1,3,4] 
	 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
	 */
	public static void main(String[] args) {
		for (var i : sumZero(5)) {
			System.out.print(i);
		}

	}

	public static int[] sumZero(int n) {
		int[] arr = new int[n];
		int k = (n % 2 == 0) ? 0 : 1 | (arr[0] = 0);
		for (int i = k; i < n; i = i + 2) {
			arr[i] = k + 1;
			arr[i + 1] = -(k + 1);
			k++;
		}
		return arr;
	}
}
