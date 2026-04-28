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
        int[] maxD = {0};
        height(root, maxD);
        return maxD[0];
    }

    private static int height(TreeNode node, int[] maxD) {
        if(node == null) return 0;
        int leftH = height(node.left, maxD);
        int rightH = height(node.right, maxD);
        maxD[0] = Math.max(maxD[0], leftH + rightH);
        return 1 + Math.max(leftH, rightH);
    }
}
