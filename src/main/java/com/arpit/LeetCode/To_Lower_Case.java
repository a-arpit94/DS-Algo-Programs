package com.arpit.LeetCode;

public class To_Lower_Case {

	public static void main(String[] args) {
		System.out.println(toLowerCase("ArPit"));
	}

	public static String toLowerCase(String str) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				int v = str.charAt(i) + 32;
				s.append((char)v);
			}
			else
				s.append(str.charAt(i));
		}
		return s.toString();
	}

}
