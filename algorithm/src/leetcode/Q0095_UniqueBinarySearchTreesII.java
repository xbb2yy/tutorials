package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0095_UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ints.add(i);
        }
        generate(list, ints);
        return list;
    }

    public void generate(List<TreeNode> list, List<Integer> ints) {
        if (list.size() == 0) {
            for (Integer anInt : ints) {
//                list.add(new TreeNode())
            }
        }
    }


    private void help(TreeNode root, int n) {
        if (root.val == n) {
            return;
        }
        if (n > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(n);
            } else {
                help(root.right, n);
            }
        }
        if (n < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(n);
            } else {
                help(root.left, n);
            }
        }
    }
}
