package com.arpit.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words {

	public static void main(String[] args) {
		System.out.println(uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));

	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] codes = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		StringBuilder sb;
		Set<String> set = new HashSet<String>();
		for (var item : words) {
			sb = new StringBuilder();
			for (char c : item.toCharArray()) {
				sb.append(codes[c - 'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
	}

}
