package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
public class Q0110_BalancedBinaryTree {

    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        helpler(root);
        return res;
    }

    public int helpler(TreeNode node) {
        if (node == null) return 0;
        int left = helpler(node.left) + 1;
        int right = helpler(node.right) + 1;
        if (Math.abs(left - right) > 1) res = false;
        return Math.max(left, right);
    }
}
