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
    int ans = 0;
    public int goodNodes(TreeNode root) {
        countGoodNodes(root, Integer.MIN_VALUE);
        return ans;
    }
    private int countGoodNodes(TreeNode root, int maxValue) {
        if(root==null) return 0;
        ans = root.val>=maxValue ? 1 : 0;

        ans += countGoodNodes(root.left, Math.max(root.val, maxValue));
        ans += countGoodNodes(root.right, Math.max(root.val, maxValue));
        return ans;
    }
}