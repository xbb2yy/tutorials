package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0107_BinaryTreeLevelOrderTraversalII {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        levelOrderBottom(root, 1);

        return list;
    }

    public void levelOrderBottom(TreeNode root, int n) {
        if (root == null) {
            return;
        }
        levelOrderBottom(root.left, n + 1);
        levelOrderBottom(root.right, n + 1);
    }

}
