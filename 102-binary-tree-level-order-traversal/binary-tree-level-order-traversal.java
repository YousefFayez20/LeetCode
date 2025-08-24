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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levellist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int levels = 0;
        if(root != null){
            queue.offer(root);
          
        }
        
        while(queue.size() != 0){
            
            int levellength = queue.size();
           
                levellist.add(new ArrayList<>());
            
            for(int i = 0 ; i<levellength ;i++){
                TreeNode curr = queue.poll();
                levellist.get(levels).add(curr.val);
            
            
              if(curr.left != null){
                queue.offer(curr.left);
                
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
            }
            levels++;

          
            
            
              
          
            
            

    
        }
        return levellist;
        
    }
}