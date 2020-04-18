package com.arpit.LeetCode;

public class Subs_Prod_And_Sum_Of_Digits {

	/*
	 * Input: n = 234 Output: 15 Explanation: Product of digits = 2 * 3 * 4 = 24 Sum
	 * of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15
	 */

	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));
	}

	public static int subtractProductAndSum(int n) {
	    int prod = 1, sum =0;
			if (n > 0 && n < 10)
				return 0;
			else {
				while (n > 0) {
					sum = sum + (n % 10);
	                prod = prod * (n % 10);
					n /= 10;
				}
			}
			return prod - sum;
	    
	}

}
