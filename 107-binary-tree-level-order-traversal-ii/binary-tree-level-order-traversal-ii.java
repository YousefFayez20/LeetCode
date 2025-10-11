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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }
        List<List<Integer>> levelList = new ArrayList<>();
        int levels = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            levelList.add(new ArrayList<>());
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                levelList.get(levels).add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                 if(node.right != null){
                    queue.add(node.right);
                }
            }
            levels++;
        }
        Collections.reverse(levelList);
        return levelList;
        
    }
}