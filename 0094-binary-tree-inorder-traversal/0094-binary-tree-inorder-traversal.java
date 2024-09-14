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
    public List<Integer> inorderTraversal(TreeNode root) {


       ArrayList<Integer> list = new ArrayList<>();
        inorderHelper(root, list); // call helper function
        return list;
    }

    private void inorderHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        inorderHelper(root.left, list); // Traverse the left subtree
        list.add(root.val);             // Visit the root node
        inorderHelper(root.right, list); 

    }
}