/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode x = root;
        while(x != null){
            if(x.val > p.val && x.val > q.val){
                x = x.left;
            }
            else if(x.val < p.val && x.val < q.val){
                x = x.right;
            }else{
                return x;
            }            
  
    }
    return null;
}
}