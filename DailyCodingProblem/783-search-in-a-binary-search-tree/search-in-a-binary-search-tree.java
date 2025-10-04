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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(val == root.val){
           //List<Integer> result = new ArrayList<>();
            return root;
        }
        if(val > root.val){
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }

    /*private List<Integer> getSubtree(TreeNode root, List<Integer> result){
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root);
        getSubtree(root.left, result);
        getSubtree(root.right, result);
         return result;
    }*/
   
}