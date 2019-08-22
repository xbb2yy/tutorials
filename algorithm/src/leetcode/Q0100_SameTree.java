package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

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
        boolean sameTree = isSameTree(p.left, q.left);
        boolean sameTree1 = isSameTree(p.right, q.right);
        return sameTree && sameTree1;
    }

}
