package com.arpit.LeetCode;

public class Cells_With_Odd_Value_In_Matrix {

	/*
	 * 
	 * Input: n = 2, m = 3, indices = [[0,1],[1,1]] Output: 6 Explanation: Initial
	 * matrix = [[0,0,0],[0,0,0]]. After applying first increment it becomes
	 * [[1,2,1],[0,1,0]]. The final matrix will be [[1,3,1],[1,3,1]] which contains
	 * 6 odd numbers.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(oddCells(2, 3, new int[][] { { 0, 1 }, { 1, 1 } }));

	}

	public static int oddCells(int n, int m, int[][] indices) {
		int[][] arr = new int[n][m];
		int count = 0;
		for (int i = 0; i < indices.length; i++) {
			for (int j = 0; j < m; j++)
				arr[indices[i][0]][j]++;
			for (int j = 0; j < n; j++)
				arr[j][indices[i][1]]++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 2 != 0)
				count++;
			}
		}

		return count;
	}

}
