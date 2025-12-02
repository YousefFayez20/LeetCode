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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null){
            queue.add(root);
        }
        int sum=0;
        while(!queue.isEmpty()){
            sum=0;
            int length = queue.size();
            for(int i=0;i<length;i++){
                TreeNode curr = queue.poll();
                sum +=curr.val;
                if(curr.left !=null){
                    queue.add(curr.left);
                }
                 if(curr.right !=null){
                    queue.add(curr.right);
                }
            }
        }
        return sum;
        
    }
}