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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Double> averages = new ArrayList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double sum = 0;
            for(int i =0;i<levelSize;i++){
                TreeNode curr = queue.poll();
                 sum += curr.val;
                 if(curr.left != null){
                    queue.offer(curr.left);
                 }
                 if(curr.right != null){
                    queue.offer(curr.right);
                 }
            }
            averages.add(sum/levelSize);
        }
        return averages;
        
    }
}