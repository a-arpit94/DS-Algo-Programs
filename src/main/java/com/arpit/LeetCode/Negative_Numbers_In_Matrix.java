package com.arpit.LeetCode;

public class Negative_Numbers_In_Matrix {

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 },
				{ -1, -1, -2, -3 }, {-2, -1, -3, -3} };
		System.out.println(countNegatives(grid));

	}

	public static int countNegatives(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] < 0) {
					count = count + (grid[0].length-j);
					break;
				}
			}
			
		}
		return count;
	}

}