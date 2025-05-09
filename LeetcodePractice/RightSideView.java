package LeetcodePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightmost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current != null) rightmost = current;

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            if (rightmost != null) result.add(rightmost.val);
        }

        return result;
    }

    public static void main(String[] args) {
        RightSideView solution = new RightSideView();

       
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);

        System.out.println("Right side view: " + solution.rightSideView(root1)); // [1, 3, 4]

    
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(5);

        System.out.println("Right side view: " + solution.rightSideView(root2)); // [1, 3, 4, 5]

       
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(3);

        System.out.println("Right side view: " + solution.rightSideView(root3)); // [1, 3]

     
        TreeNode root4 = null;

        System.out.println("Right side view: " + solution.rightSideView(root4)); // []
    }
}
