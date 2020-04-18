package com.arpit.LeetCode;

public class Decrypt_String_From_Alphabet_To_Integer_Mapping {
	/*
	 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
	 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
	 */

	public static void main(String[] args) {
		System.out.println(freqAlphabets("20#21#22#23#24#25#26#"));
	}

	public static String freqAlphabets(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != '#') {
				sb.append((char) (48 + str.charAt(i)));
			} else {
				sb.delete(sb.length() - 2, sb.length());
				sb.append((char)(96+Integer.parseInt(str.substring(i - 2, i))));
			}
		}
		return sb.toString();
	}
}