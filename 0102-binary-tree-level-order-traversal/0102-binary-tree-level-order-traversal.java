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
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelNumber = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i=0; i<levelNumber; i++) {
                TreeNode current = queue.poll();
                levelNodes.add(current.val);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            result.add(levelNodes);
        }
        return result;
    }
}