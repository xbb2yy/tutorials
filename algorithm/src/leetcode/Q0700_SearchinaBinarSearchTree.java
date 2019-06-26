package leetcode;

import leetcode.common.TreeNode;

public class Q0700_SearchinaBinarSearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        if (root.val == val) {
            return root;
        }

        if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }

    }
}
