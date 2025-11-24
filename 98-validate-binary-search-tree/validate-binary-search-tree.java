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
    public boolean isValidBST(TreeNode root) {
       return Validate(root,Long.MIN_VALUE,Long.MAX_VALUE); 
    }
     boolean Validate(TreeNode root, long left,long right)
    {
        if(root == null ){
            return true;
        }
        if( root.val > left && root.val < right){
            return Validate(root.left,left,root.val) && Validate(root.right,root.val,right);
        }else{
            return false;
        }
        
    }
}