package com.arpit.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Jewels_And_Stones {

	/*
	 * Input: J = "aA", S = "aAAbbbb" Output: 3
	 */

	public static void main(String[] args) {
		System.out.println(numJewelsInStones_2("aA", "aAAbbbb"));
	}

	// cool way but taking too much time
	public static int numJewelsInStones_1(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();
	}

	public static int numJewelsInStones_2(String J, String S) {
		Map<Character, Integer> jewels = new HashMap<Character, Integer>();
		int i, count = 0;
		for (i = 0; i < J.length(); i++) {
			jewels.put(J.charAt(i), 0);
		}
		for (i = 0; i < S.length(); i++) {
			if (jewels.containsKey(S.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	// Fastest Way to do it
	public static int numJewelsInStones_3(String J, String S) {
		int count = 0;
		for (var c : S.toCharArray()) {
			if (J.indexOf(c) > 0)
				count++;
		}
		return count;
	}

	public class MutableInt {
		int value = 1; // note that we start at 1 since we're counting

		public void increment() {
			++value;
		}

		public int get() {
			return value;
		}
	}
}