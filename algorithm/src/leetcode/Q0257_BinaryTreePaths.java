package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0257_BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        help(list, root, String.valueOf(root.val));
        return list;
    }

    private void help(List<String> list, TreeNode node, String str) {
        if (node.right == null && node.left == null) {
            list.add(str);
        }
        if (node.right != null) {
            help(list, node.right, str + "->" + node.right.val);
        }
        if (node.left != null) {
            help(list, node.left, str + "->" + node.left.val);
        }
    }
}
