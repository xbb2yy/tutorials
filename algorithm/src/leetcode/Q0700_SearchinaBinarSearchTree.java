package leetcode;

import leetcode.common.TreeNode;

public class Q0700_SearchinaBinarSearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        if (root.val == val) {
            return root;
        }

        if (searchBST(root.right, val) != null) {
            return searchBST(root.right, val);
        }

        if (searchBST(root.left, val) != null) {
            return searchBST(root.left, val);
        }

        return null;
    }
}
