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
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        
        traverse(root);
        return minDiff;
    }
    void traverse(TreeNode root){
       if(root == null){
            return ;
        }
        traverse(root.left);
        if(prev != null){
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;
        traverse(root.right);
    }
}