package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0113_PathSumII {

    private int sum;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum = sum;
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        help(root, list, l);
        return list;
    }

    private void help(TreeNode node, List<List<Integer>> list, List<Integer> l) {
        if (node.left == null && node.right == null) {
            Integer reduce = l.stream().reduce(0, (t, u) -> t + u);
            if (reduce == sum) {
                list.add(l);
            }
        }
        if (node.left != null) {
            ArrayList<Integer> integers = new ArrayList<>(l);
            integers.add(node.left.val);
            help(node.left, list, integers);
        }
        if (node.right != null) {
            ArrayList<Integer> integers = new ArrayList<>(l);
            integers.add(node.right.val);
            help(node.right, list, integers);
        }
    }
}
