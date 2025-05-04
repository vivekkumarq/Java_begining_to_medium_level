package LeetcodePractice;

public class MaxDepthBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    
    public static TreeNode buildSampleTree() {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        return new TreeNode(3, left, right);
    }

    
    public static void main(String[] args) {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();

        TreeNode root = buildSampleTree();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum Depth of the Binary Tree: " + depth); 
    } 
}
