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
    public TreeNode sortedArrayToBST(int[] nums) {

        int mid = nums.length/2;
        TreeNode Head = new TreeNode(nums[mid]);
        Head.left = divide(nums,0,mid-1,Head);
        Head.right = divide(nums,mid+1,nums.length-1,Head);
        return Head;
    }
    private TreeNode divide(int[] nums,int start, int last, TreeNode Head){
        if(Head == null || start > last|| last >= nums.length){
            return null;
        }
        int mid = (last+start)/2;
        Head = new TreeNode(nums[mid]);
        Head.left = divide(nums,start,mid-1,Head);
        Head.right = divide(nums,mid+1,last,Head);
        return Head;
    }
}