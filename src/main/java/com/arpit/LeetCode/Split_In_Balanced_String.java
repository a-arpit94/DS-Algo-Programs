package com.arpit.LeetCode;

public class Split_In_Balanced_String {

	/*
	 * Input: s = "RLRRLLRLRL" Output: 4 Explanation: s can be split into "RL",
	 * "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
	 */

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRLLRLRL"));

	}

	public static int balancedStringSplit(String s) {
		int c = 0,result=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L')
				c++;
			else if (s.charAt(i) == 'R')
				c--;
			if(c == 0)
				result++;

		}
		return result;
	}

}
