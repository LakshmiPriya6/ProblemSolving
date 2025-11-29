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
        ArrayList<Integer> leaves1 = new ArrayList<Integer>();
        ArrayList<Integer> leaves2 = new ArrayList<Integer>();
        leaves1 = getLeafNodes(root1, leaves1);
        leaves2 = getLeafNodes(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    private ArrayList<Integer> getLeafNodes(TreeNode root, ArrayList<Integer> leaves){
        if(root == null){
            return leaves;
        }
        else{
            if(root.left == null && root.right == null){
                leaves.add(root.val);
            } else {
                getLeafNodes(root.left,leaves);
                getLeafNodes(root.right,leaves);
            }
        }
        return leaves;
    }
}