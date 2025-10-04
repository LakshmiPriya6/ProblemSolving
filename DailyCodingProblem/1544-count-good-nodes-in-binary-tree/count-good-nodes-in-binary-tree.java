/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }

        int count = node.val >= maxVal ? 1 : 0;

        int newMaxVal = Math.max(maxVal, node.val);

        // Recursively count good nodes in the left and right subtrees.
        count += dfs(node.left, newMaxVal);
        count += dfs(node.right, newMaxVal);

        return count;
    }
}