package com.arpit.LeetCode;

import java.util.*;

public class Group_the_People_Given_the_Group_Size_They_Belong_To {
	/*
	 * Input: groupSizes = [3,3,3,3,3,1,3] 
	 * Output: [[5],[0,1,2],[3,4,6]]
	 * Explanation: Other possible solutions are [[2,1,6],[5],[0,4,3]] and
	 * [[5],[0,6,2],[4,3,1]].
	 */
	public static void main(String[] args) {
		int[] groupSizes = new int[] { 3, 3, 3, 3, 3, 1, 3 };
		for (var item : groupThePeople(groupSizes)) {
			System.out.print(item);
		}
	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> res = new ArrayList<>();
		Object[] group = new Object[groupSizes.length + 1];

		for (int i = 0; i < groupSizes.length; i++) {
			var n = groupSizes[i];
			if (group[n] == null)
				group[n] = new ArrayList<Integer>(n);
			List<Integer> list = ((List<Integer>) group[n]);
			list.add(i);
			if (list.size() == n) {
				res.add(list);
				group[n] = new ArrayList<Integer>(n);

			}

		}
		return res;

	}

}