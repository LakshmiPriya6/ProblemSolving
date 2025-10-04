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
    private Pair<Boolean, Integer> dfs(TreeNode node){
        if(node == null){
            return new Pair<>(true,0);
        }

        Pair<Boolean, Integer> leftPair = dfs(node.left);
        Pair<Boolean, Integer> rightPair = dfs(node.right);
        boolean left = leftPair.getKey();
        boolean right = rightPair.getKey();
        int count = leftPair.getValue() + rightPair.getValue();

        if(left && right){
            if(node.left !=null && node.left.val != node.val){
                return new Pair<>(false,count);
            }
            if(node.right !=null && node.right.val != node.val){
                return new Pair<>(false,count);
            }
            count++;
            return new Pair<>(true,count);
        }
        return new Pair<>(false,count);
    }
    public int countUnivalSubtrees(TreeNode root) {
        return dfs(root).getValue();
    }


}