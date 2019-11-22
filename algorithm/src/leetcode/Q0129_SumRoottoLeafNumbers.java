package leetcode;

import leetcode.common.TreeNode;

public class Q0129_SumRoottoLeafNumbers {

    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        help(0, root);
        return sum;
    }

    private void help(int n, TreeNode node) {
        if (node.left == null && node.right == null) {
            sum += n * 10 + node.val;
        }
        if (node.left != null) {
            help(10 * n + node.val, node.left);
        }
        if (node.right != null) {
            help(10 * n + node.val, node.right);
        }
    }
}
