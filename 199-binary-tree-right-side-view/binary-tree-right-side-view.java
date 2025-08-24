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
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> levels = new ArrayList<>();
        boolean FoundTopLevel = false;
        if(root != null){
            queue.offer(root);
            levels.add(root.val);
        }
        while(!queue.isEmpty()){

            int numberoflevels = queue.size();
            for(int i = 0; i<numberoflevels;i++){
                TreeNode curr = queue.poll();
                if(curr.right != null){
                    queue.offer(curr.right);
                    if(FoundTopLevel == false){
                        levels.add(curr.right.val);
                        FoundTopLevel = true;
                    }
                }
                if(curr.left != null){
                    queue.offer(curr.left);
                    if(FoundTopLevel == false){
                        levels.add(curr.left.val);
                        FoundTopLevel = true;
                    }
                }
            }
            FoundTopLevel = false;

        }
        return levels;
    }
}