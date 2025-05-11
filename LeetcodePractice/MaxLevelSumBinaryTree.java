package LeetcodePractice;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSumBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1, maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int currLevelSum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                currLevelSum += curr.val;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            if (currLevelSum > maxSum) {
                maxSum = currLevelSum;
                maxLevel = level;
            }
            level++;
        }

        return maxLevel;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        MaxLevelSumBinaryTree solution = new MaxLevelSumBinaryTree();

        // Example 1: root = [1,7,0,7,-8,null,null]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(0);
        root1.left.left = new TreeNode(7);
        root1.left.right = new TreeNode(-8);
        System.out.println("Max Level Sum is at Level: " + solution.maxLevelSum(root1)); // Output: 2

        // Example 2: root = [989,null,10250,98693,-89388,null,null,null,-32127]
        TreeNode root2 = new TreeNode(989);
        root2.right = new TreeNode(10250);
        root2.right.left = new TreeNode(98693);
        root2.right.right = new TreeNode(-89388);
        root2.right.right.right = new TreeNode(-32127);
        System.out.println("Max Level Sum is at Level: " + solution.maxLevelSum(root2)); // Output: 2
    }
}
