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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafnodes1 = new ArrayList();
        List<Integer> leafnodes2 = new ArrayList();
        dfs(root1, leafnodes1);
        dfs(root2, leafnodes2);
        return leafnodes1.equals(leafnodes2);
    }

    public void dfs(TreeNode node, List<Integer> leafValues){
        if(node!= null){
            if(node.left == null && node.right == null){
                leafValues.add(node.val);
            }
            dfs(node.left, leafValues);
            dfs(node.right, leafValues);
        }
    }


}