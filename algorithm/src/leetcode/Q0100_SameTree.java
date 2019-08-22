package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

/**
 * 判断两棵二叉树是否相等
 */
@Pass
public class Q0100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q != null) {
            return false;
        }
        if (q == null && p != null) {
            return false;
        }
        if (q == null && p == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean sameTreeLeft = isSameTree(p.left, q.left);
        boolean sameTreeRight = isSameTree(p.right, q.right);
        return sameTreeLeft && sameTreeRight;
    }

}
