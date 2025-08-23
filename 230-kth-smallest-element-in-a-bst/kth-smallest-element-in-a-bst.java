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
    public int kthSmallest(TreeNode root, int k) {
        //we need stack to store nodes
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int counter = 0;
        while(curr != null || !stack.empty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            counter++;
            if(counter == k){
                return curr.val;
            }
            curr = curr.right;

        }
        return 0;

    
    
    
    }

}