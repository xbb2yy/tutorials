package leetcode;

import leetcode.common.TreeNode;

public class Q0111_MinimumDepthofBinaryTree {

    private int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        help(root, 0);
        return min;
    }

    public void help(TreeNode root, int depth) {
        if (root != null && root.right == null && root.left == null) {
            min = depth < min ? depth : min;
        }
        if (root != null) {
            help(root.left, depth + 1);
            help(root.right, depth + 1);
        }
    }
}
