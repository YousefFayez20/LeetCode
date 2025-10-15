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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return null;
        }
        
        StringBuilder sbR = new StringBuilder();
        sbR.append(root.val);
        if(root.left == null && root.right == null){
            list.add(sbR.toString());
            return list;
        }
        sbR.append("->");
        binaryTreePathsHelper(root.left,new StringBuilder(sbR));
        binaryTreePathsHelper(root.right,new StringBuilder(sbR));
        
        return list;
    }
    public void binaryTreePathsHelper(TreeNode root,StringBuilder sb){
        if(root == null){
            return ;
        }
        sb.append(root.val);
        sb.append("->");
        binaryTreePathsHelper(root.left,new StringBuilder(sb));
        binaryTreePathsHelper(root.right,new StringBuilder(sb));
        if(root.left == null && root.right == null){
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            list.add(sb.toString());
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}