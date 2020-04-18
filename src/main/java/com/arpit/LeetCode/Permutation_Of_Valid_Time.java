package com.arpit.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_Of_Valid_Time {

	public static void main(String[] args) {
		Permutation_Of_Valid_Time(1, 4, 7, 2);
	}

	static void Permutation_Of_Valid_Time(int a, int b, int c, int d) {
		// Using Math.abs to handle negative values
		permutation("", "" + Math.abs(a) + Math.abs(b) + Math.abs(c) + Math.abs(d));
	}

	private static void permutation(String perm, String word) {
		int hours = Integer.parseInt((perm + word).substring(0, 2));
		int mins = Integer.parseInt((perm + word).substring(2));

		if (word.isEmpty() && hours <= 24 && mins <= 59)
			System.out.println(perm);

		else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
			}
		}

	}

}
