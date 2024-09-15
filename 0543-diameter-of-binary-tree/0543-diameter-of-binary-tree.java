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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        int leftDiam = diameterOfBinaryTree(root.left); // recursively calculate leftDiam
        int leftHt = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt;

        int ans =  Math.max(selfDiam , Math.max(leftDiam, rightDiam));


        return ans;
    }

    public static int height(TreeNode root){
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }
}