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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            // An empty tree is balanced.
            return true;
        }

        int height = checkHeightAndBalance(root);

        return height != -1;
    }


    private int checkHeightAndBalance(TreeNode node) {
        // empty subtree has a height 0
        if(node == null){
            return 0;
        }

        // 1. Check left subtree 
        int leftHeight = checkHeightAndBalance(node.left);
        if(leftHeight == -1) {
            return -1;
        }

        // 2. Check right subtree
        int rightHeight = checkHeightAndBalance(node.right);
        if(rightHeight == -1) {
            return -1;
        }

        // 3. Check Balance at the Current Node:
        // The absolute difference in height must be <= 1.
        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1; 
        }

        // 4. Success Case: The node and both its subtrees are balanced.
        // Return the actual height: 1 (for current node) + max height of children.
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
