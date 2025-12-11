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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        return dfs(sum,root,false);
    }
    int dfs(int sum, TreeNode root, boolean isLeft){
        if(root ==null) return sum;
        sum = dfs(sum,root.left,true);
        if(isLeft==true && root.left == null && root.right == null){
            return sum +root.val;
        }
        sum = dfs(sum,root.right,false);
        return sum;

    }
}