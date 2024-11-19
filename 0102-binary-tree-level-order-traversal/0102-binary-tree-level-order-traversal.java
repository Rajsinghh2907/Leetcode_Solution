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
        if (root == null) {
            return result; // Return empty list for empty tree
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Marker for the end of a level

        List<Integer> currentLevel = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            if (currNode == null) { // End of a level
                result.add(new ArrayList<>(currentLevel)); // Add current level to result
                currentLevel.clear(); // Clear for the next level
                if (!q.isEmpty()) {
                    q.add(null); // Add marker for the next level
                }
            } else {
                currentLevel.add(currNode.val); // Add current node's value to current level
                if (currNode.left != null) {
                    q.add(currNode.left); // Add left child
                }
                if (currNode.right != null) {
                    q.add(currNode.right); // Add right child
                }
            }
        }

        return result;
    }
}