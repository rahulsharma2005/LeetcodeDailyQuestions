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
        List<Integer> result = new ArrayList<>();
        int n = 0;
        rightview(root,result,n);
        return result;
    }
    public void rightview(TreeNode root, List<Integer> result , int currdepth){
        if(root == null) return;
        if(currdepth == result.size()){
            result.add(root.val);
        }
        rightview(root.right, result, currdepth + 1);
        rightview(root.left, result ,currdepth + 1);
    }
}