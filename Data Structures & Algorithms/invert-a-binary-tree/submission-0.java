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
    public TreeNode invertTree(TreeNode root) {
        // Recursive dsfs
        if(root == null) return null; 

        // Swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp; 

        // Recusively invert both subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root; 
    }
}
