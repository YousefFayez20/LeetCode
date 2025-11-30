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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rights = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            int levels = queue.size();
            boolean foundright = false;
            for(int i=0;i<levels;i++){
                TreeNode curr = queue.poll();
                if(foundright == false){
                    rights.add(curr.val);
                    foundright = true;
                } 
                if(curr.right != null) queue.add(curr.right);
                if(curr.left != null) queue.add(curr.left);
            }
            foundright = false;
        }
        return rights;
        
    }
}