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
            while(curr.left != null){
                curr = curr.left;
            }
            return curr;
         }

    public TreeNode deleteNode(TreeNode root, int key) {
        //traverse till we find the desired node, not found return null
        if(root == null) return null;
        //we will search subtrees if they have the element
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
            }
        else{
                // we found the element now we should handle the cases

                //case 1: node have no children -> return null
                if(root.right == null && root.left == null){
                    return null;
                }else if(root.left == null){//case 2: have one right child
                return root.right;
                }else if(root.right == null){//case 2: have one left child
                return root.left;
                }else{
                    //we have left and right children
                    //find minimum element in right subtree and replace it with our node
                    //then delete this node
                    TreeNode x = MinNode(root.right);
                    root.val = x.val;
                    root.right = deleteNode(root.right,x.val);
                    return root;

                }
            }
            return root;
        }
       
            
    }
