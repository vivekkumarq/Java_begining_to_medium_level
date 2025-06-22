package LeetcodePractice;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class RootToLeafPaths {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path + node.val + "->", result);
        }

        if (node.right != null) {
            dfs(node.right, path + node.val + "->", result);
        }
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        RootToLeafPaths sol = new RootToLeafPaths();
        List<String> paths = sol.binaryTreePaths(root);

        System.out.println(paths); 
    }
}

