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
    //we need a stack to store ordered elements
    Stack<TreeNode> stack = new Stack<>();
    //traverse and till the most left subtree, add the leftmost then pop and add n
    int n = 0;
    //go to the right subtree and travese left, if not found add and pop and n++
    TreeNode curr = root;
    TreeNode x = root;
    while (curr != null || !stack.empty()){
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }
        
        curr = stack.pop();
        n++;
        if(n == k){
            return curr.val;
        }
            curr = curr.right;
        
    }
    return -1;
    
    }

}