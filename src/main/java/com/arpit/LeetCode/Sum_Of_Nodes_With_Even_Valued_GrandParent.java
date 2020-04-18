package com.arpit.LeetCode;

public class Sum_Of_Nodes_With_Even_Valued_GrandParent {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(7);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);

		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(3);

		root.left.left.left = new TreeNode(9);
		root.left.left.right = null;

		root.left.right.left = new TreeNode(1);
		root.left.right.right = new TreeNode(4);

		root.right.left.left = null;
		root.right.left.right = null;

		root.right.right.left = null;
		root.right.right.right = new TreeNode(5);

		System.out.println(sumEvenGrandparent(root));

	}

	static int sum = 0;

	public static int sumEvenGrandparent(TreeNode root) {

		if (checkGrandSon(root)) {
			sumEvenGrandparent(root.left);
			if (root.val % 2 == 0) {
				System.out.println(root.left.left.val);
				System.out.println( root.left.right.val);
			}

			sumEvenGrandparent(root.right);
			if (root.val % 2 == 0) {
				System.out.println(root.right.left.val);
				System.out.println(root.right.right.val);
			}
		}
		return sum;
	}

	static boolean checkGrandSon(TreeNode root) {
		if (root.left.left.equals(null) && root.left.right.equals(null) && root.right.left.equals(null) && root.right.right.equals(null))
			return false;
		return true;
	}
}
