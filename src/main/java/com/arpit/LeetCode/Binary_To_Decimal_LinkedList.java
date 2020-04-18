package com.arpit.LeetCode;

public class Binary_To_Decimal_LinkedList {

	public static void main(String[] args) {

		ListNode first = new ListNode(1);
		first.next = new ListNode(0);
		first.next.next = new ListNode(1);
		first.next.next.next=new ListNode(0);
//		while (first != null) {
//			System.out.println(first.val);
//			first = first.next;
//		}
		 System.out.println(getDecimalValue(first));

	}

	public static int getDecimalValue(ListNode head) {
		int value = 0;
		while (head != null) {
			value = 2*value + head.val;
			head = head.next;
		}
		return value;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
