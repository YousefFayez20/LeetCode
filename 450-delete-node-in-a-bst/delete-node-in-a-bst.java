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
         public TreeNode MinNode(TreeNode root){
            TreeNode curr = root;
                while (curr != null && curr.left != null){
                    curr = curr.left;}
                    //now we got the minimum
                    //if the minimum node has right child
                    return curr;
         }

    public TreeNode deleteNode(TreeNode root, int key) {
        //traverse till we find the desired node, not found return null
        if(root == null){
            return null;
        }

        if(root.val > key ){
            root.left = deleteNode(root.left,key);
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }else{
            //if we returned null, we may detach the tree if the node has children
            if(root.right == null && root.left == null){
                return null;
            }else if(root.right != null && root.left == null){
                return root.right;
            }else if(root.right == null && root.left != null){
                return root.left;
            }else{
                // we will search for the smallest leaf node and put in the node's place
                TreeNode minimumnode = MinNode(root.right);
                root.val = minimumnode.val;
                root.right = deleteNode(root.right, minimumnode.val);
                




            }
        }
        return root;




    }
}