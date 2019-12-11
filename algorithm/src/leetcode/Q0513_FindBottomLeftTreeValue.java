package leetcode;

import leetcode.common.TreeNode;

public class Q0513_FindBottomLeftTreeValue {

    private int res = -1, max = 0;
    public int findBottomLeftValue(TreeNode root) {
        help(root, 0);
        return res;
    }

    private void help(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        help(node.left, depth + 1);
        if (depth > max) {
            max = depth;
            res = node.val;
        }
        help(node.right, depth + 1);
    }
}
