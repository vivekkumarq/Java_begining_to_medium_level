package LeetcodePractice;

public class SearchBST {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }


    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (val < root.val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

 
    public void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        SearchBST solution = new SearchBST();


        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);

        int val1 = 2;
        TreeNode result1 = solution.searchBST(root1, val1);
        System.out.print("Subtree rooted at node " + val1 + ": ");
        solution.printTree(result1);  
        System.out.println();

    
        int val2 = 5;
        TreeNode result2 = solution.searchBST(root1, val2);
        System.out.println("Subtree rooted at node " + val2 + ": " + (result2 == null ? "null" : result2.val));
    }
}
