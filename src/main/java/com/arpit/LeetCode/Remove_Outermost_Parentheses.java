package com.arpit.LeetCode;

public class Remove_Outermost_Parentheses {

	/*
	 * Input: "(()())(())" Output: "()()()" Explanation: The input string is
	 * "(()())(())", with primitive decomposition "(()())" + "(())". After removing
	 * outer parentheses of each part, this is "()()" + "()" = "()()()".
	 */

	public static void main(String[] args) {

		System.out.println(removeOuterParentheses("(()())(())(()(()))"));
	}

	public static String removeOuterParentheses(String str) {
		int count = 0;
		StringBuffer sb = new StringBuffer();

		for (var c : str.toCharArray()) {
			if(c == '(')
			{
				count++;
				if(count>1)
					sb.append('(');
			}
			else {
				count--;
				if(count>0)
				sb.append(')');
			}
		}
		return sb.toString();
	}

}