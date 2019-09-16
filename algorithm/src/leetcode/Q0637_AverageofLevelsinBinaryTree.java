package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0637_AverageofLevelsinBinaryTree {

    private List<List<Integer>> list = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        help(root, 0);
        List<Double> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> lst = this.list.get(i);
            int sum = 0;
            for (int j = 0; j < lst.size(); j++) {
                sum += lst.get(j);
            }
            l.add((double) sum / lst.size());
        }
        return l;
    }

    private void help(TreeNode node, int n) {
        if (node == null) {
            return;
        }
        List<Integer> ints;
        if (list.size() < n + 1) {
            ints = new ArrayList<>();
            list.add(ints);
        } else {
            ints = list.get(n);
        }
        ints.add(node.val);
        help(node.left, n + 1);
        help(node.right, n + 1);
    }
}
