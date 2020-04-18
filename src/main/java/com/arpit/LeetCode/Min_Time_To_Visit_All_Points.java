package com.arpit.LeetCode;

public class Min_Time_To_Visit_All_Points {

	public static void main(String[] args) {
		int[][] pointsA = new int[][] { { 1, 1 }, { 3, 4 }, { -1, 0 } };
		int[][] pointsB = new int[][] { { 1, 1 }, { 5, 1 }, { 8, 1 }, { 8, 4 }, { 10, 6 } };
		int[][] pointsC = new int[][] { { 3, 2 }, { -2, 2 } };
		System.out.println(minTimeToVisitAllPoints(pointsA));
	}

	public static int minTimeToVisitAllPoints(int[][] points) {
		int sum = 0;
		for (int i = 0; i < points.length - 1; i++) {
			sum += Math.max(Math.abs(points[i + 1][0] - points[i][0]), Math.abs(points[i + 1][1] - points[i][1]));
		}
		return sum;
	}

}
