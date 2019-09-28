package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q0107_BinaryTreeLevelOrderTraversalII {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        levelOrderBottom(root, 0);
        Collections.reverse(list);
        return list;
    }

    public void levelOrderBottom(TreeNode root, int n) {
        if (root == null) {
            return;
        }
        List<Integer> ints;
        if (list.size() < n + 1) {
            ints = new ArrayList<>();
            list.add(ints);
        } else {
            ints = list.get(n);
        }
        levelOrderBottom(root.left, n + 1);
        levelOrderBottom(root.right, n + 1);
        ints.add(root.val);
    }

}
