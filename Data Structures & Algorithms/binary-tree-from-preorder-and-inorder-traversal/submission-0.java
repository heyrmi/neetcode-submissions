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
    private Map<Integer, Integer> inorderIndex;
    private int preIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndex.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inLeft, int inRight) {
        // no elements in this range
        if (inLeft > inRight)
            return null;

        // preorder[preIdx] is always the current subtree's root
        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);

        // Find root's position in inorder — O(1)
        int mid = inorderIndex.get(rootVal);

        // IMPORTANT: build LEFT before RIGHT
        // because preIdx increments in preorder (left subtree comes first)
        root.left = build(preorder, inLeft, mid - 1);
        root.right = build(preorder, mid + 1, inRight);

        return root;
    }
}
