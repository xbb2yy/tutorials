package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
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
