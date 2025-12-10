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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> paths=new ArrayList<>();
        dfs(paths,root,targetSum,0,new ArrayList<>());
        return paths;
    }
    void dfs(List<List<Integer>> paths,TreeNode root, int targetSum,int sum, List<Integer> curr){
        if(root == null) return;
        sum += root.val;
        curr.add(root.val);
        if(root.left == null && root.right==null && sum ==targetSum){
            paths.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
            sum-=root.val;
            return;
        }
        dfs(paths,root.left,targetSum,sum,curr);
        dfs(paths,root.right,targetSum,sum,curr);
        curr.remove(curr.size()-1);
        sum-=root.val;
    }
}