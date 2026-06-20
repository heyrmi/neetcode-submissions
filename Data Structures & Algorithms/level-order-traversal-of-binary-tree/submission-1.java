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
        if (root == null)
            return result; // Edge case: empty tree

        // Queue stores the nodes to be visited
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // 1. Get the number of nodes at the current level
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            // 2. Process only the nodes belonging to this specific level
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                // 3. Add children of the current node to the queue for the next level
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
