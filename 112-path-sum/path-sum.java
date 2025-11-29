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
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null) return false;
        return dfs(root, targetSum, root.val);
    }
    boolean dfs(TreeNode root, int targetSum, int sum){
        boolean left =false;
        boolean right=false;

        if(root.left != null){
            left = dfs(root.left,targetSum,sum + root.left.val);
        }
        if(root.right != null){
          right = dfs(root.right,targetSum,sum + root.right.val);
        }
        if(sum == targetSum &&root.right == null&&root.left == null) return true;
        return left || right;
        
        

    }
}