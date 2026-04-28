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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false; 

        if(isSameTree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        // Both null -> match
        if(p == null && q == null) return true; 
        // One null, other not -> mismatch
        if(p == null || q == null) return false; 
        // Values differ -> mismatch
        if(p.val != q.val) return false; 

        // Both children must match
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
