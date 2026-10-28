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
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> sol = new ArrayList<>();
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                TreeNode m = q.poll();
                if(flag){
                    sol.add(m.val);
                }else sol.add(0,m.val);
                if(m.left != null) q.offer(m.left);
                if(m.right != null) q.offer(m.right);
            }
            flag = !flag;
            ans.add(sol);
        } 
        return ans;
    }
}