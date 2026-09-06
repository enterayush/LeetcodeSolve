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
    int diameter = Integer.MIN_VALUE;
    int depth(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0, depth(root.left));
        int right = Math.max(0, depth(root.right));
        diameter = Math.max(diameter,left+right+root.val);
        return root.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
       if(root == null) return 0;
        depth(root);
        return diameter;
    }
}