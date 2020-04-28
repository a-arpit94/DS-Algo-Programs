package com.arpit.LeetCode.Top.Interview.Ques.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

	/*
	 * Input: [1,2,3,1] Output: true
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 2 };
		System.out.println(containsDuplicate(nums));
	
	}

	public static boolean containsDuplicate(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == nums[i + 1])
				return true;
		return false;
		/*
		 * Time Complexity: O(nlogn) Space Complexity: O(1)
		 */
	}

	/*
	 * We know that search operations is O(n) in an unsorted array. Utilizing a data
	 * structure with faster search time will speed up the entire algorithm. There
	 * are many data structures commonly used as dynamic sets such as Binary Search
	 * Tree and Hash Table. The operations we need to support here are search() and
	 * insert(). For a self-balancing Binary Search Tree (TreeSet or TreeMap in
	 * Java), search() and insert() are both O(logn) time. For a Hash Table (HashSet
	 * or HashMap in Java), search() and insert() are both O(1) on average.
	 * Therefore, by using hash table, we can achieve linear time complexity for
	 * finding the duplicate in an unsorted array.
	 */

	public boolean containsDuplicateBetterApproach(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for (int x : nums) {
			if (set.contains(x))
				return true;
			set.add(x);
		}
		return false;
		/*
		 * Time Complexity: O(n) Space Complexity: O(n)
		 */
	}

}
