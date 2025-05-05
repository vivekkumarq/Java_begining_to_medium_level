package LeetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

 
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);

        return leaves1.equals(leaves2);
    }

  
    private void collectLeaves(TreeNode node, List<Integer> leafList) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            leafList.add(node.val);
            return;
        }
        collectLeaves(node.left, leafList);
        collectLeaves(node.right, leafList);
    }

   
    public static TreeNode buildTree1() {
        return new TreeNode(3,
            new TreeNode(5,
                new TreeNode(6),
                new TreeNode(2,
                    new TreeNode(7),
                    new TreeNode(4)
                )
            ),
            new TreeNode(1,
                new TreeNode(9),
                new TreeNode(8)
            )
        );
    }

    public static TreeNode buildTree2() {
        return new TreeNode(3,
            new TreeNode(5,
                new TreeNode(6),
                new TreeNode(7)
            ),
            new TreeNode(1,
                new TreeNode(4),
                new TreeNode(2,
                    new TreeNode(9),
                    new TreeNode(8)
                )
            )
        );
    }

    public static void main(String[] args) {
        LeafSimilarTrees solution = new LeafSimilarTrees();

        TreeNode root1 = buildTree1();
        TreeNode root2 = buildTree2();

        boolean result = solution.leafSimilar(root1, root2);
        System.out.println("Are the two trees leaf-similar? " + result); // Expected: true
    }
    
}
