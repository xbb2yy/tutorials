package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
public class Q0124_BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max(root);
        return max;
    }

    private int max(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(max(node.left), 0);
        int right = Math.max(max(node.right), 0);
        int cur = left + right + node.val;
        max = Math.max(max, cur);
        return node.val + Math.max(left, right);
    }
}
