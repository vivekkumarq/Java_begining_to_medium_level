package LeetcodePractice;

public class LongestZigZagPath {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    private int maxLen = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        dfs(root.left, 1, true);  
        dfs(root.right, 1, false); 
        return maxLen;
    }

    private void dfs(TreeNode node, int length, boolean isLeft) {
        if (node == null) return;

        maxLen = Math.max(maxLen, length);

        if (isLeft) {
            dfs(node.right, length + 1, false);  
            dfs(node.left, 1, true);           
        } else {
            dfs(node.left, length + 1, true);    
            dfs(node.right, 1, false);           
        }
    }


    public static void main(String[] args) {
        LongestZigZagPath sol = new LongestZigZagPath();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.left.right = new TreeNode(1);

        System.out.println("Longest ZigZag Path Length: " + sol.longestZigZag(root)); // Output: 3
    }
    
}
