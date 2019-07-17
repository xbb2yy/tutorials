package leetcode;

import leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q897_IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {

        Set<Integer> set = new TreeSet<>();
        visit(root, set);
        Integer[] a = new Integer[set.size()];
        Integer[] integers = set.toArray(a);
        Arrays.sort(integers);

        TreeNode node = new TreeNode(integers[0]);
        TreeNode tmp = node;
        for (int i = 1; i < integers.length ; i++) {
            TreeNode treeNode = new TreeNode(integers[i]);
            tmp.right = treeNode;
            tmp = treeNode;
        }
        return node;

    }

    public void visit(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return;
        }
        set.add(node.val);
        visit(node.left, set);
        visit(node.right, set);
    }
}
