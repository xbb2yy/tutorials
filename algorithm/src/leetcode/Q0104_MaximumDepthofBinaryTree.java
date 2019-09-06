package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
public class Q0104_MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return length(root, 0);
    }

    private int length(TreeNode node, int length) {
        if (node == null) {
            return length;
        }
        length++;
        return Math.max(length(node.right, length), length(node.left, length));
    }
}
