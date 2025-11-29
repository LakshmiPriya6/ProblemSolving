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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        int level = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int levelSum = 0;
            
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                levelSum += currNode.val;
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            } 
            level++;
            if(levelSum > maxSum){
                maxSum =  levelSum;
                maxLevel = level;
            }
            
        }
        return maxLevel;
    }
}