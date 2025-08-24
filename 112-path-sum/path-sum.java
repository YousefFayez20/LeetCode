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
    static int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0 ,targetSum);
    }
    public boolean dfs(TreeNode root,int sum ,int targetSum){
        if(root == null) return false;
         
         sum = sum + root.val;
         System.out.println(sum);

         if(root.right == null && root.left == null && sum == targetSum){
            return true;
         }
         if(dfs(root.left, sum ,targetSum)) return true;
        
         if(dfs(root.right, sum ,targetSum)){ return true;}
         return false;

    }

}