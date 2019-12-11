package leetcode;

import leetcode.common.TreeNode;

public class Q0222_CountCompleteTreeNodes {

    private int count = 0;

    public int countNodes(TreeNode root) {
        help(root);
        return count;
    }

    private void help(TreeNode node) {
        if (node == null) {
            return;
        }
        count++;
        help(node.right);
        help(node.left);
    }
}
