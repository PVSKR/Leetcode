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
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     if(root==null) return ans;
    //     bfs(ans, root);
    //     return ans;
    // }
    // private void bfs(List<Integer> ans, TreeNode root) {
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.offer(root);
    //     while(!q.isEmpty()) {
    //         int level = q.size();
    //         for(int i=0; i<level; i++) {
    //             TreeNode curr = q.poll();
    //             if(i==0) ans.add(curr.val);
    //             if(curr.right!=null) q.offer(curr.right);
    //             if(curr.left!=null) q.offer(curr.left);
    //         }
    //     }
    // }
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {        
        rightView(root, 0);
        return ans;
    }
    private void rightView(TreeNode root, int level) {
        if(root==null) return;
        if(level == ans.size()) ans.add(root.val);

        rightView(root.right, level+1);
        rightView(root.left, level+1);
    }
}