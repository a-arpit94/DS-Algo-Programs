package com.arpit.LeetCode;

public class Defanged_IP_Address {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(defangIPaddr("255.100.50.0"));

	}

	public static String defangIPaddr(String address) {

		// return address.replaceAll("\\.", "[.]"); // 2 ms
		// return String.join("[.]", address.split("\\.")); //1 ms
		
		// <0 ms
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if(address.charAt(i)!='.')
				result.append(address.charAt(i));
			else
				result.append("[.]");
		}

		return result.toString();
	}

}
