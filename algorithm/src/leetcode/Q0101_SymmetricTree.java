package leetcode;

import leetcode.common.TreeNode;

public class Q0101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode right, TreeNode left) {
        if (right == null && left == null) {
            return true;
        }
        if (right == null) {
            return false;
        }
        if (left == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }
}
