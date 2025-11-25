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
    public boolean isSameTree(TreeNode p, TreeNode q)   {
        if(p == null && q == null){
            return true;
        }else if((p != null && q==null)||(p==null && q != null)){
            return false;
        }
        boolean left = true;
        boolean right = true;
        if( p != null && q != null && p.val == q.val){
             left = isSameTree(p.left, q.left);
             right = isSameTree(p.right, q.right);
        } else if (p != null && q != null && p.val != q.val){
            return false;
        }
        

        return left && right;


        
    }
}