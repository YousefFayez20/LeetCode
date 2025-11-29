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
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        return preorder(root,new StringBuilder());

    }
    int preorder(TreeNode root, StringBuilder sb){
         if(root == null){
            return 0;
        }
        sb.append(root.val);
        int left = preorder(root.left,new StringBuilder(sb));
        int right = preorder(root.right,new StringBuilder(sb));
        int sumNode = 0;
        if(root.left == null && root.right == null){
         sumNode = Integer.parseInt(sb.toString());
        }
        int total_sum = sumNode+left+right;
        return total_sum;
    }
}