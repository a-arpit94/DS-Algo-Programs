package com.arpit.LeetCode;

public class First_Unique_Char {

	/*
	 * s = "leetcode" return 0.
	 * 
	 * s = "loveleetcode", return 2.
	 */

	public static void main(String[] args) {
		System.out.println(firstUniqChar_1("loveleetcode"));

	}

	public static int firstUniqChar(String s) {
		int[] letters = new int[26];
		for (char c : s.toCharArray()) {
			letters[(int) c - 97]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (letters[(int) s.charAt(i) - 97] == 1)
				return i;
		}
		return -1;
	}

	//Slower because of built-in functions 
	public static int firstUniqChar_1(String s) {
		for (char c: s.toCharArray()) {
			if(s.indexOf(c) == s.lastIndexOf(c))
				return s.indexOf(c);
		}
		
		return -1;
	}
}
