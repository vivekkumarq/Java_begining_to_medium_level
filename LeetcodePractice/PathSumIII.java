package LeetcodePractice;

public class PathSumIII {

     public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int count = countPathsFromNode(root, targetSum);


        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    private int countPathsFromNode(TreeNode node, int sum) {
        if (node == null) return 0;

        int count = 0;
        if (node.val == sum) count++;

  
        count += countPathsFromNode(node.left, sum - node.val);
        count += countPathsFromNode(node.right, sum - node.val);

        return count;
    }


    public static TreeNode buildExampleTree1() {
        TreeNode node3 = new TreeNode(3, new TreeNode(3), new TreeNode(-2));
        TreeNode node2 = new TreeNode(2, null, new TreeNode(1));
        TreeNode node5 = new TreeNode(5, node3, node2);
        TreeNode node_3 = new TreeNode(-3, null, new TreeNode(11));
        return new TreeNode(10, node5, node_3);
    }

    public static void main(String[] args) {
        PathSumIII solution = new PathSumIII();

        TreeNode root = buildExampleTree1();
        int targetSum = 8;
        int result = solution.pathSum(root, targetSum);
        System.out.println("Number of paths with sum " + targetSum + ": " + result);  // Expected: 3
    }
}
