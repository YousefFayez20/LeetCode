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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int level =0;
        if(root != null){
            queue.offer(root);
        }

        while (!queue.isEmpty()){
            int length = queue.size();
              list.add(new ArrayList<Integer>());
            for (int i = 0; i < length; i++) {
                TreeNode curr = queue.poll();
                list.get(level).add(curr.val);
                    if(curr.left != null){
                        queue.offer(curr.left);
                    }
                    if(curr.right != null){
                        queue.offer(curr.right);
                    }

            }
            if(level %2 ==1){
                Collections.reverse(list.get(level));
            }
            level++;
        }
        return list;

    }
}