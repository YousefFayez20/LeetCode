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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<Boolean> state = new Stack<>();
        stack.push(root);
        state.push(false);
        if(root == null){
            return list;
        }
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            boolean currState = state.pop();
            if(curr != null && currState == true){
                list.add(curr.val);
            }else{
                stack.push(curr);
                state.push(true);
                if(curr.right != null){
                stack.push(curr.right);
                state.push(false);
                }
                 if(curr.left != null){
                stack.push(curr.left);
                state.push(false);
                }

            }
        }
        return list;
        
    }
}