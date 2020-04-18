package com.arpit.LeetCode;

public class Max_69_Number {

	public static void main(String[] args) {
		System.out.println(maximum69Number(9999));
	}

	public static int maximum69Number(int num) {
		int rev = reverse(num);
		int temp = 0;
		int flag = 0;
		while (rev > 0) {
			if (rev % 10 == 6 && flag == 0) {
				temp = temp * 10 + 9;
				flag = 1;
			} else
				temp = temp * 10 + rev % 10;

			rev /= 10;
		}
		return temp;
	}

	static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

}
