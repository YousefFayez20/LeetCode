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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return DepthDfs(root,0);
    }
    public int DepthDfs(TreeNode root, int count){
             if(root != null){
               count++;
               }
               if(root == null){
                return count;
               }
        int DepthLeft = DepthDfs(root.left,count);
        int DepthRight = DepthDfs(root.right,count);
        if(DepthLeft > DepthRight){
            return DepthLeft;
        }else{
           return DepthRight;
        }


    }
}